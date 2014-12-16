package me.lidonghe.springmvc.model;

public class Greeting {
	
	private long id;
	private String name;
	
	public Greeting(String pName){
		
		name = pName;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
