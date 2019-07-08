package com.unionbank.data;

public class sing {
	public static void main(String[] args) {
		Singelton sing = Singelton.getInstance();
		System.out.println(sing);
		Singelton sing1 = Singelton.getInstance();
		//System.out.println(sing1);

		Singelton sing2 = Singelton.getInstance();
		//System.out.println(sing2);

		Singelton sing3 = Singelton.getInstance();
		//System.out.println(sing3);

		
		
	}

}
