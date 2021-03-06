package br.com.prolife.enums;

public enum BloodTypeEnum {

	A_Neg("A-"),
	A_Pos("A+"),
	B_Neg("B-"),
	B_Pos("B+"),
	AB_Neg("AB-"),
	AB_Pos("AB+"),
	O_Neg("O-"),
	O_Pos("O+"),
	UNDEFINED("U");
	
	private String name;
	
	BloodTypeEnum(String name){
		this.name= name;
	}

	public String getName() {
		return name;
	}

}
