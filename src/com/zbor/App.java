package com.zbor;

public class App {

	public static void main(String[] args) {
		Zbor karakter = new Zbor();
		
		int resenie = karakter.zbor("Faktoriel", 'a');
		System.out.println(resenie);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		System.out.println("Duplikati:");
		karakter.duplikat("Faktorieelaqqa");
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		karakter.dupli("Faktorieelaqqa");
		System.out.println("\n");
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		karakter.duplikatDva("Faktorieelaqqa");
		
		

	}

}
