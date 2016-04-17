package com.briup.ch07;

public class Telephone{
	private long id;
	private String name;
	private String factory;
	public Telephone(){
	
	}
	public Telephone(long id,String name,String factory){
		this.id = id;
		this.name = name;
		this.factory = factory;
	}

	public void setId(long id){
		this.id = id;
	}
	public long getId(){
		return this.id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setFactory(String factory){
		this.factory = factory;
	}
	public String getFactory(){
		return this.factory;
	}
	public String toString(){
		return "telephone[id:"+this.id+",name:"+this.name+",factory:"+this.factory+"]";
	}
}