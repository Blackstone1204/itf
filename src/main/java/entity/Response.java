package entity;

import java.util.HashMap;
import java.util.Map;

public class Response {
	
	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public Object getData() {
		return data;
	}


	public void setData(Object data) {
		this.data = data;
	}


	String msg;
	int code;
	Object data;
	
	
	public Response(int code,String msg,Object data){
		this.code=code;
		this.msg=msg;
		this.data=data;
		

	}

}
