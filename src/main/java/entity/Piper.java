package entity;

public abstract class Piper {

	public Piper next=null;
	public abstract void before();
	public abstract void dispatch();
	public abstract void after();
	
	public void process(){
		this.before();
		this.dispatch();
		this.after();
		
		if(null!=this.next){
			
			//System.out.println(this.next);
			this.next.process();
		}
		
		
	}
	public void setNext(Piper next){
		this.next=next;
		
	}
}
