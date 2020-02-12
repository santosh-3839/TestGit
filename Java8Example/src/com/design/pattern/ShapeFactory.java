package com.design.pattern;

public class ShapeFactory {
	
	public Shape getShape(String str)
	{
		if (str==null)
		{
			return null;
		}
		if(str.equalsIgnoreCase("circle"))
		{
			return new Circle();
		} else if(str.equalsIgnoreCase("Rectangle"))
		{
			return new Rectangle();
		}else if(str.equalsIgnoreCase("Square"))
		{
			return new Square();
		}
		
		return null;
	}

}
