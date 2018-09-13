package entity;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.ParamInfoMapper;
import com.model.ParamInfo;
import com.model.Target;
import com.utils.HttpUtils;


public class Req extends Piper{
	
	@Autowired
	ParamInfoMapper pm;
	
	private Target target;
	
	public Req(Target target){
		this.target=target;
	}
	
	public String toString(){
		return String.format("[url=%s,method=%s,paramInfo=%s]", target.getUrl(),target.getMethod(),"");
	}

	@Override
	public void dispatch() {
		// TODO Auto-generated method stub
		
	List<ParamInfo> params=pm.selectByTargetId(target.getId());
		

	  
	}

	@Override
	public void before() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void after() {
		// TODO Auto-generated method stub
		
	}

}
