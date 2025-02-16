package day2;

public class MyMath {


	    public static boolean isPerfectNumber(int n) {
	        if (n <= 0) return false;
	        int sum = 0;
	        for (int i = 1; i <= n / 2; i++) {
	            if (n % i == 0) sum += i;
	        }
	        return sum == n;
	    }

	    public static long factorial(int n) {
	        long result = 1;
	        for (int i = 1; i <= n; i++) {
	            result *= i;
	        }
	        return result;
	    }

	    public static boolean isPrime(int n) {
	        if (n <= 1) return false;
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) return false;
	        }
	        return true;
	    }

	    public static long sumOfPrimes(int n) {
	        long sum = 0;
	        for (int i = 2; i <= n; i++) {
	            if (isPrime(i)) sum += i;
	        }
	        return sum;
	    }

	    public static boolean isArmstrongNumber(int n) {
	        int temp = n, sum = 0, digits = String.valueOf(n).length();
	        while (temp != 0) {
	            int digit = temp % 10;
	            sum += Math.pow(digit, digits);
	            temp /= 10;
	        }
	        return sum == n;
	    }

	    public static int reverseNumber(int n) {
	        StringBuilder str = new StringBuilder(String.valueOf(n));
	        return Integer.parseInt(str.reverse().toString());
	    }

	    public static int decimalToBinary(int n) {
	        return Integer.parseInt(Integer.toBinaryString(n));
	    }

	    public static int binaryToDecimal(int n) {
	        return Integer.parseInt(String.valueOf(n), 2);
	    }

	    public static int getSumOfNfibos(int n) {
	        int sum = 0, a = 0, b = 1;
	        for (int i = 0; i < n; i++) {
	            sum += a;
	            int temp = a;
	            a = b;
	            b = temp + b;
	        }
	        return sum;
	    }

	    public static boolean isPalindromeNumber(int n) {
	        int original = n, reversed = 0;
	        while (n != 0) {
	            int digit = n % 10;
	            reversed = reversed * 10 + digit;
	            n /= 10;
	        }
	        return original == reversed;
	    }
	

}
