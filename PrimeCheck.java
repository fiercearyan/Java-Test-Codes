package loops;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter Number :-");
		int a = sc.nextInt();
		boolean isPrime = true;
		for (int i = 2; i*i<=a; i++) {         // loop run between 2 to root-a
			if(a%i == 0) {
				isPrime = false;
				break;
			}
		}
		if (a<2) {
			isPrime=false;
		}
		
		if(isPrime==false) {
			System.out.println(a + " is not a prime number");
			}
		else {
			System.out.println(a + " is a prime number");
		}
	
	}

}
