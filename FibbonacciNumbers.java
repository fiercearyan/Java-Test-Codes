package loops;

import java.util.Scanner;

public class FibbonacciNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("I want the Fibonacci Number upto :- ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.print(a+" ");
		System.out.print(b+" ");

		
		for (int i=0; i<n-2; i++) {
			int c = a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

	}

}