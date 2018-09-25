package entity;

import java.util.ArrayList;
import java.util.List;

import com.model.Directive;
import com.model.Plan;
import com.model.Target;
import com.utils.Dispatcher;

public class Test extends Piper{
	
	private String title;
	private String contentType;
	private String parentPath;
	private String step;
	private Target target;
	private Plan plan;
	private List<Directive> before=new ArrayList<Directive>();
	private List<Directive>  after=new ArrayList<Directive>();
	
	public Test(Plan plan,Target target){
		this.plan=plan;
		this.contentType="";
		this.target=target;
		this.title=this.target.getTitle();
		this.parentPath="";
		this.step=String.valueOf(System.currentTimeMillis());
		
	}

	public void dispatch(){
		
		

		
	}
	
	public void before(){

		
		
		
	}
	
	public void after(){

		
	}
}
