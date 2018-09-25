package com.utils;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;
@Component
public class HttpUtils2 {
	public static Map<String, ContentType> map = new HashMap<String, ContentType>();
	static {
		map.put("kv",null);
		map.put("json", ContentType.APPLICATION_JSON);
		map.put("xml", ContentType.APPLICATION_XML);
		map.put("javascript", ContentType.APPLICATION_JSON);
		map.put("text", ContentType.TEXT_PLAIN);
		map.put("xml2", ContentType.TEXT_XML);
		map.put("html", ContentType.TEXT_HTML);
	}

	public static String doGet(String url, Map<String, String> param) {

		// 创建Httpclient对象
		CloseableHttpClient httpclient = HttpClients.createDefault();

		String resultString = "";
		CloseableHttpResponse response = null;
		try {
			// 创建uri
			URIBuilder builder = new URIBuilder(url);
			if (param != null) {
				for (String key : param.keySet()) {
					builder.addParameter(key, param.get(key));
				}
			}
			URI uri = builder.build();

			// 创建http GET请求
			HttpGet httpGet = new HttpGet(uri);

			// 执行请求
			response = httpclient.execute(httpGet);
			// 判断返回状态是否为200
			if (response.getStatusLine().getStatusCode() == 200) {
				resultString = EntityUtils.toString(response.getEntity(), "UTF-8");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (response != null) {
					response.close();
				}
				httpclient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return resultString;
	}

	public static String doGet(String url) {
		return doGet(url, null);
	}

	/**
	 * 
	 * @Author: BlackStone
	 * @Description: post x-www-form-urlencode
	 * @Date:2018年9月7日 下午5:02:30
	 */
	public static String doPostUrlEncode(String url, Map<String, String> param) {
		// 创建Httpclient对象
		CloseableHttpClient httpClient = HttpClients.createDefault();
		CloseableHttpResponse response = null;
		String resultString = "";
		try {
			// 创建Http Post请求
			HttpPost httpPost = new HttpPost(url);
			// 创建参数列表
			if (param != null) {
				List<NameValuePair> paramList = new ArrayList<NameValuePair>();
				for (String key : param.keySet()) {
					paramList.add(new BasicNameValuePair(key, param.get(key)));
				}
				// 模拟表单
				UrlEncodedFormEntity entity = new UrlEncodedFormEntity(paramList);
				httpPost.setEntity(entity);
			}
			// 执行http请求
			response = httpClient.execute(httpPost);
			resultString = EntityUtils.toString(response.getEntity(), "utf-8");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				response.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return resultString;
	}

	/**
	 * 
	 * @Author: BlackStone
	 * @Description: post Raw[json,xml,xml2,html,text]
	 * @Date:2018年9月7日 下午5:13:55
	 */

	public static String doPostRaw(String url, String content, String type) {
		// 创建Httpclient对象
		CloseableHttpClient httpClient = HttpClients.createDefault();
		CloseableHttpResponse response = null;
		String resultString = "";
		try {
			// 创建Http Post请求
			HttpPost httpPost = new HttpPost(url);
			// 创建请求内容
			StringEntity entity = new StringEntity(content, map.get(type));
			httpPost.setEntity(entity);
			// 执行http请求
			response = httpClient.execute(httpPost);
			resultString = EntityUtils.toString(response.getEntity(), "utf-8");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				response.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return resultString;
	}

	/**
	 * 
	 * @Author: BlackStone
	 * @Description: post file
	 * @Date:2018年9月7日 下午5:39:53
	 * https://blog.csdn.net/wsdtq123/article/details/78888734
	 */
	public static String postFileMultiPart(String url, String localFileName)
			throws ClientProtocolException, IOException {

		Map<String, ContentBody> reqParam = new HashMap<String, ContentBody>();
		reqParam.put("Filename", new StringBody(localFileName, ContentType.MULTIPART_FORM_DATA));
		reqParam.put("pictitle", new StringBody(localFileName, ContentType.MULTIPART_FORM_DATA));
		reqParam.put("dir", new StringBody("upload1", ContentType.MULTIPART_FORM_DATA));
		reqParam.put("fileNameFormat", new StringBody("{time}{rand:6}", ContentType.MULTIPART_FORM_DATA));
		reqParam.put("fileName", new StringBody(localFileName, ContentType.MULTIPART_FORM_DATA));
		reqParam.put("fileName", new StringBody(localFileName, ContentType.MULTIPART_FORM_DATA));
		reqParam.put("upfile", new FileBody(new File(localFileName)));
		reqParam.put("Upload", new StringBody("Submit Query", ContentType.MULTIPART_FORM_DATA));

		CloseableHttpClient httpclient = HttpClients.createDefault();

		try {
			// 创建httpget.
			HttpPost httppost = new HttpPost(url);
			// setConnectTimeout：设置连接超时时间，单位毫秒。setConnectionRequestTimeout：设置从connect
			// Manager获取Connection
			// 超时时间，单位毫秒。这个属性是新加的属性，因为目前版本是可以共享连接池的。setSocketTimeout：请求获取数据的超时时间，单位毫秒。
			// 如果访问一个接口，多少时间内无法返回数据，就直接放弃此次调用。
			RequestConfig defaultRequestConfig = RequestConfig.custom().setConnectTimeout(5000)
					.setConnectionRequestTimeout(5000).setSocketTimeout(15000).build();
			httppost.setConfig(defaultRequestConfig);

			System.out.println("executing request " + httppost.getURI());

			MultipartEntityBuilder multipartEntityBuilder = MultipartEntityBuilder.create();
			for (Entry<String, ContentBody> param : reqParam.entrySet()) {
				multipartEntityBuilder.addPart(param.getKey(), param.getValue());
			}
			HttpEntity reqEntity = multipartEntityBuilder.build();
			httppost.setEntity(reqEntity);

			// 执行post请求.
			CloseableHttpResponse response = httpclient.execute(httppost);

			System.out.println("got response");

			try {
				// 获取响应实体
				HttpEntity entity = response.getEntity();
				// System.out.println("--------------------------------------");
				// 打印响应状态
				// System.out.println(response.getStatusLine());
				if (entity != null) {
					return EntityUtils.toString(entity, Charset.forName("UTF-8"));
				}
				// System.out.println("------------------------------------");
			} finally {
				response.close();

			}
		} finally {
			// 关闭连接,释放资源
			try {
				httpclient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public static Set<String> getKeys(){
		return  map.keySet();
	}

}