package entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.DirectiveMapper;
import com.dao.ParamInfoMapper;
import com.model.Directive;
import com.model.ParamInfo;
import com.model.Plan;
import com.model.Target;
import com.utils.DirectiveUtils;
import com.utils.Dispatcher;
import com.utils.HttpUtils2;

public class TestAPI extends Piper{
	
	@Autowired ParamInfoMapper paramInfoMapper;
	@Autowired DirectiveMapper directiveMapper;
	
	private String title;
	private String contentType;
	private String parentPath;
	private String step;
	private Target target;
	private Plan plan;
	private List<Directive> before=new ArrayList<Directive>();
	private List<Directive>  after=new ArrayList<Directive>();
	
	public TestAPI(Plan plan,Target target){
		this.plan=plan;
		this.contentType="";
		this.target=target;
		this.title=this.target.getTitle();
		this.parentPath="";
		this.step=String.valueOf(System.currentTimeMillis());
		
		
	}

	public void dispatch(){
		
		String url=this.target.getUrl();
		
		String method=this.target.getMethod();
		
		String contentType=this.target.getContentType();
		
		Map<String,String> map=new HashMap<String,String>();
		List<ParamInfo> list=paramInfoMapper.selectByTargetId(this.target.getId());
		for(ParamInfo item:list){
			map.put(item.getK(),item.getV());
			
		}
		
		System.out.println(String.format("调用接口 =>method=%s url=%s contentType=%s", method,url,contentType));
		
		if("get".equals(method)){
			
			if(map.size()==0)HttpUtils2.doGet(url);
			else HttpUtils2.doGet(url, map);
			
		}else if("post".equals(method)){
			
			//处理键值格式
			if("kv".equals(contentType)){
				HttpUtils2.doPostUrlEncode(url, map);
			//处理文件格式
			}else if("file".equals(contentType)){
				//HttpUtils2.postFileMultiPart(url,"");
				throw new UnsupportedOperationException("content-type="+contentType+"格式暂时不支持");
            //处理RAW格式
			}else{
				HttpUtils2.doPostRaw(url, list.get(0).getV(), contentType);
			}
			
			
		}else if("delete".equals(method)){
			throw new UnsupportedOperationException("method="+method+"方法暂时不支持");
			
		}else if("put".equals(method)){
			throw new UnsupportedOperationException("method="+method+"方法暂时不支持");
			
		}else 
			throw new UnsupportedOperationException("method="+method+"方法暂时不支持");
		
		

		
	}
	
	public void before(){
		//返回有序指令 并执行
		List<Directive> ds = directiveMapper.selectBeforeByTargetId(this.target.getId());
		
		for(Directive d:ds){
			DirectiveUtils.dispatch(d.getInfo());
		}

		
		
		
	}
	
	public void after(){
		//返回有序指令 并执行
		List<Directive> ds = directiveMapper.selectAfterByTargetId(this.target.getId());
		
		for(Directive d:ds){
			
			DirectiveUtils.dispatch(d.getInfo());
		}

		
	}
}
