package exercicios;

import java.util.Scanner;

public class Taboada {
	public static void main(String[] args) {
		
	}
	public class Object {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("Insira um numero ");
			int num = in.nextInt();

			for (int i=0; i< 10; i++){
				   System.out.println(num + " x " + (i+1) + " = " + 
				     (num * (i+1)));
				  }
		  }
		}

}
