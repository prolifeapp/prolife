package br.com.prolife.enums;

public enum UrgencyEnum {

	I("Imediato"),
	C("Combine"),
	U("Undefined");
	
	private String name;
	
	UrgencyEnum(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	
}
