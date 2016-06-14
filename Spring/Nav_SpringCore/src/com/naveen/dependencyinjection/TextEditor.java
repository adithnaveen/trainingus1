package com.naveen.dependencyinjection;

public class TextEditor {
	private SpellCheck spellcheck;
	
	public TextEditor(SpellCheck spellcheck){
		System.out.println("inside cons text editor");
		this.spellcheck = spellcheck;
	}
	
	public void spellCheck(){
		this.spellcheck.checkSpelling();
	}
}
