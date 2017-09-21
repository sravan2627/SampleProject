package com.sravan.spring;

import java.util.List;

public class Triangle2 
{

	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void Draw()
	{
		for(Point point: points)
			System.out.println("Point = (" + point.getX() + " , " + point.getY() + ")" );
	}
	
	
}
