package entity;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

public class PiperLine {
	
	public static Piper header=null;
	
	public static void add(Piper piper){
		
		
		//System.out.println("add piper:"+piper);
		
		Piper tmp=null;
		
		if(null==header){
			header=piper;
			
		}else{
			tmp=header;
			header=piper;
			piper.setNext(tmp);
			
		}
		
	}
	
	public static void start(){
		header.process();
	}
	
	public static void shutdown(){
		
	}
	
	public static void main(String[] args){
		
		String data="[{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'},"
				+ "{'url':'http://www.baidu.com','paramInfo':{'a':'11','bb':'22'},'method':'post'}"
				+ "]";
		
	    Gson gs=new Gson();
	    List<Req> jsonListObject = gs.fromJson(data, new TypeToken<List<Req>>(){}.getType());
	    for(Req req:jsonListObject){
	    	
	    	System.out.println(req);
	 
	    	PiperLine.add(req);
	    	
	    }
		

	    PiperLine.start();
		
		
	}

}
