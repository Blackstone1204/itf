package com.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.script.ScriptEngineManager;

import org.apache.commons.jexl2.Expression;
import org.apache.commons.jexl2.JexlContext;
import org.apache.commons.jexl2.JexlEngine;
import org.apache.commons.jexl2.MapContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.serviceimpl.EnvService;
import com.serviceimpl.GlobalVariableService;
import com.serviceimpl.LocalVariableService;
import com.serviceimpl.ResultService;

@Component
public class Dispatcher {
	
	
	 static EnvService envService;
	 static GlobalVariableService globalService;
	 static LocalVariableService localService;
	 static ResultService resultService;
	
	private static Map<String,Object> map=new HashMap<String, Object>();
	static{
		map.put("it.environment", envService);
		map.put("it.global", globalService);
		map.put("it.local", localService);
		map.put("it.response", resultService);
		map.put("it.db",null);

	}
	
	@Autowired
	public Dispatcher(EnvService envService,GlobalVariableService globalService,LocalVariableService localService,ResultService resultService){
		Dispatcher.envService=envService;
		Dispatcher.globalService=globalService;
		Dispatcher.localService=localService;
		
	}
	
	
	public static Map<String,Object> getMap(){
		return map;
	}
	public static void main(String[] args){
		String exp="list.size()";
		Map<String,Object> map=new HashMap();
		List<String> list=new ArrayList<String>();
		list.add("222");
		map.put("list",list );
		map.put("me.test.Test",Dispatcher.class);
		Object obj=Dispatcher.dispatch(exp,map);
		
		Dispatcher.dispatch("me.test.Test.a()",map);
		
		System.out.println(obj);
		
				
	}
	
	public static void a(){
		System.out.println("staitc run");
		
	}
	

	/**
	 * 
	 * @author: Longjun
	 * @Description: 使用commons的jexl可实现将字符串变成可执行代码的功能
	 * @date:2016年3月21日 下午1:45:13
	 */
	public static Object dispatch(String jexlExp,Map<String,Object> map){  
        JexlEngine jexl=new JexlEngine();  
        Expression e = jexl.createExpression(jexlExp);  
        JexlContext jc = new MapContext();  
        for(String key:map.keySet()){  
            jc.set(key, map.get(key));  
        }  
        if(null==e.evaluate(jc)){  
            return "";  
        }  
        return e.evaluate(jc);  
	} 

}