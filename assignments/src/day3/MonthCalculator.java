package day3;
import java.time.LocalDate;
import java.time.Period;

public class MonthCalculator {


	    public static int calculateMonthsDifference(LocalDate startDate, LocalDate endDate) {
	        Period period = Period.between(startDate, endDate);
	        
	        return period.getYears() * 12 + period.getMonths();
	    }

	    public static void main(String[] args) {
	        LocalDate startDate = LocalDate.of(2021, 1, 15);  
	        LocalDate endDate = LocalDate.of(2024, 6, 20);    

	        int monthsDifference = calculateMonthsDifference(startDate, endDate);

	        System.out.println("Months difference: " + monthsDifference);
	    }
	

}
