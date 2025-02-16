package day6;

import java.io.IOException;
import java.util.Scanner;

public class CityStateMapTest {
	public static void main(String[] args) throws IOException {
		CityStateMap obj=new CityStateMap();
		obj.reader();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter operation:");
		System.out.println("1 for getting all cities");
		System.out.println("2 for getting all states");
		System.out.println("3 for getting cities for a state");
		System.out.println("4 for adding");
		System.out.println("5 for delete");
		int operation = sc.nextInt();
		sc.nextLine();
		switch(operation) {
		case 1:
			System.out.println(obj.getAllCities());
			break;
		case 2:
			System.out.println(obj.getAllStates());
			break;
		case 3:
			String city=sc.nextLine();
			System.out.println(obj.getCity(city));
			break;
		case 4:
			System.out.println("Enter state:");
			String state=sc.nextLine();
			System.out.println("Enter city:");
			String city1=sc.nextLine();
			obj.addPair(city1, state);
			break;
		case 5:
			System.out.println("Enter state:");
			String state1=sc.nextLine();
			obj.delCity(state1);
			break;
		}

	}
}
