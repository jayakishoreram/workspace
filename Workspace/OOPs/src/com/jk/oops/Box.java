package com.jk.oops;

public class Box extends Object{

	private int length;
	
	private int width;
	
	private int hight;
	
	Box(int length, int width, int hight){
		this.length = length;
		this.width = width;
		this.hight = hight;
	}
	
	Box(){}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}
	
	public int volume(){
		return length * hight * width;
	}
	
}