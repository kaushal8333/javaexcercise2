package day5;

public class AverageCalculator {
	public double calAverage(int n) {
		if(n<0) {
			throw new IllegalArgumentException("Not a natural number");
		}
		double sum=n*(n+1)/2.0;
		return sum;
	}
	
	public static void main(String[] args) {
		AverageCalculator obj=new AverageCalculator();
		try {
			obj.calAverage(3);
			obj.calAverage(-1);
		}
		catch(IllegalArgumentException e) {
			System.out.println("Not a natural number");
		}
	}
}
