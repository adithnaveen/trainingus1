package com.naveen.interfaces;

public class Triangle implements Figure{
	private int len;
	private int bre;


	public int getLen() {
		return len;
	}


	public void setLen(int len) {
		this.len = len;
	}


	public int getBre() {
		return bre;
	}


	public void setBre(int bre) {
		this.bre = bre;
	}


	@Override
	public void area() {
		System.out.println("Area of Triangle is " + (len * bre * 0.5));
	}
}
