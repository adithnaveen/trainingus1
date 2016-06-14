package com.naveen.di.setter;

public class TextEditor {
	private SpellChecker spellcheker;

	
	public SpellChecker getSpellcheker() {
		return spellcheker;
	}

	public void setSpellcheker(SpellChecker spellcheker) {
		System.out.println("inside setter of spell checker - text editor ");
		this.spellcheker = spellcheker;
	}
	
	public void checkSpell(){
		spellcheker.checkSpell();
	}
}
