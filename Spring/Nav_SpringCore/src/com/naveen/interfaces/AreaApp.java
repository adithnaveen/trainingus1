package com.naveen.interfaces;

public class AreaApp {
	private Figure figure;

	public void setFigure(Figure figure) {
		this.figure = figure;
	}
	
	public void giveArea(){
		figure.area();
	}
	
}	
