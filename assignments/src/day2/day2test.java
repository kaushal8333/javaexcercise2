package day2;
import java.util.Scanner;

public class day2test {
	public static void main(String[] args) {
		int n,option;
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter number for option");
		option=sc.nextInt();
		switch(option) {
		case 1:
			if(MyMath.isPerfectNumber(n)) {
				System.out.println("Perfect number");
			}
			else {
				System.out.println("Not a perfect number");
			}
			break;
		case 2:
			System.out.println("Factorial:"+MyMath.factorial(n));
			break;
		case 3:
			if(MyMath.isPrime(n)) {
				System.out.println("Prime number");
			}
			else {
				System.out.println("Not a prime number");
			}
			break;
		case 4:
			System.out.println("Sum of primes:"+MyMath.sumOfPrimes(n));
			break;
		case 5:
			if(MyMath.isArmstrongNumber(n)) {
				System.out.println("Armstrong number");
			}
			else {
				System.out.println("Not an armstrong number");
			}
			break;
		case 6:
			System.out.println("Reverse of number:"+MyMath.reverseNumber(n));
			break;
		case 7:
			System.out.println("Decimal to binary:"+MyMath.decimalToBinary(n));
			break;
		case 8:
			System.out.println("Binary to decimal:"+MyMath.binaryToDecimal(n));
			break;
		case 9:
			System.out.println("Sum of primes:"+MyMath.getSumOfNfibos(n));
			break;
		case 10:
			if(MyMath.isPalindromeNumber(n)) {
				System.out.println("Palindrome number");
			}
			else {
				System.out.println("Not an palindrome number");
			}
			break;
		}
			
	}
}
