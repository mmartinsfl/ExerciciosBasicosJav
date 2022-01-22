package exercicios;

import java.util.Scanner;

public class Object {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira um numero ");
		int num = in.nextInt();
		
	    
		Scanner in2 = new Scanner(System.in);
		System.out.println("Insira outro numero ");
		int num2 = in.nextInt();

	    System.out.println("O resultado é : " + (num * num2));  // Output user input
	  }
	}

