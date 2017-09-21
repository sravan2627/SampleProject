package com.sravan.spring;

public class Triangle 
{
	
	private String name;
	private int height;
	
	public Triangle(String name)
	{
		this.name=name;
	}
	
	public Triangle(int height)
	{
		this.height=height;
	
	}
	
	public Triangle(String name,int height)
	{
		this.name=name;
		this.height=height;
	}
	
	public String getName() {
		return name;
	}
	
	

/*	public void setName(String name) {
		this.name = name;
	}*/
	

	public int getHeight() {
		return height;
	}
	public void Draw()
	{
		
		//name="sravan";
	System.out.println(  getName() + " triangle "  + getHeight());
	}
}
