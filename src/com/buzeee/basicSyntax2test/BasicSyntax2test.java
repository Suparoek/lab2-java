package com.buzeee.basicSyntax2test;

public class BasicSyntax2test {
	public static void main(String[] arges) {
		System.out.println("The Dog name ="+brak()+"bark");
		float myfloat = 3.5f;
		int  myInt = (int)myfloat;
		System.out.println("float->int:"+myInt);
		float myfloat1 = myInt;
		System.out.println("int->float:"+myfloat1);
		double mydouble = 3.55555555555555;
		float myfloat2 = (float)mydouble;
		System.out.println("double -> float:"+myfloat2);
		char mychart = '5';
		int  myInt1 = (int) mychart;
		System.out.println("char -> int :"+myInt1);
		final String hello ="Hello";
		 /// String hello ="Word"; 
		  System.out.println(hello);
	}
	public static String brak() {
			String dogName ="kapook";
			
			return dogName;
	}
}
