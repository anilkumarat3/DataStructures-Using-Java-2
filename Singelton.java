package com.unionbank.data;

public class Singelton {
	private Singelton(){
		
	}
	private static Singelton sing=new Singelton();
	
	public static Singelton getInstance(){
		return sing;
	}

}
