package com.utils;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.jexl2.Expression;
import org.apache.commons.jexl2.JexlContext;
import org.apache.commons.jexl2.JexlEngine;
import org.apache.commons.jexl2.MapContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.EnvMapper;
import com.dao.GlobalVariableMapper;
import com.dao.LocalVariableMapper;
import com.dao.ResultMapper;

@Component
public class DirectiveUtils {
	
	private static Map<String,Object> map=new HashMap<String, Object>();
	private static EnvUtils eu;
	private static GlobalUtils gu;
	private static LocalUtils lu;
	private static RespUtils ru;
	private static DBUtils du;
	static{
		map.put("it.env",eu);
		map.put("it.local",lu);
		map.put("it.global", gu);
		map.put("it.response",ru);
		map.put("it.db",du);
		
	}
	
	
	@Autowired
	public DirectiveUtils(EnvUtils eu,GlobalUtils gu,LocalUtils lu,RespUtils ru, DBUtils du){
         DirectiveUtils.eu=eu;
         DirectiveUtils.gu=gu;
         DirectiveUtils.lu=lu;
         DirectiveUtils.ru=ru;
		 DirectiveUtils.du=du;
	}
	
	
	
	
	

	public static Object dispatch(String jexlExp){  
		
		System.out.println("调用指令 => "+jexlExp);
		
     
       JexlEngine jexl=new JexlEngine();  
       Expression e = jexl.createExpression(jexlExp);  
       JexlContext jc = new MapContext();  
       for(String key:map.keySet()){  
           jc.set(key, map.get(key));  
       }  
       if(null==e.evaluate(jc)){  
    	   System.out.println("指令不合法！");
           return "";  
       }  
       return e.evaluate(jc);  
	} 

	
	
	
	
	

}


