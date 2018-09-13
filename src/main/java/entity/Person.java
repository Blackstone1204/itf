package entity;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;



public class Person  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3015620206075448966L;
	public String name;
	public String age;
	
	public Person(String name,String age){
		this.name=name;
		this.age=age;
	}

}
