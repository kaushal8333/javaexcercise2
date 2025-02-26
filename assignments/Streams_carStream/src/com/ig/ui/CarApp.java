package com.ig.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ig.model.Car;
import com.ig.service.CarService;
import com.ig.impl.CarImpl;

public class CarApp {
	public static void main(String[] args){
		Car cars[]= {
						new Car("Maruti","Swift Dezire",810000.00),
						new Car("Hyundai","Verna",1100000.00),
						new Car("Toyota","Innova",2450000.00),
						new Car("Audi","Q3",4500000.00)
				
					};

		List<Car> carList = new ArrayList<>(Arrays.asList(cars));
		
		try {
			CarService car=new CarImpl();
			System.out.println("Sum of all car prices: " + car.sumOfPrices(carList));
	        System.out.println("List of Car Names: " + car.getCarNames(carList));
	        System.out.println("Set of Car Makers: " + car.getCarMakers(carList));
	        System.out.println("Highest Priced Car: " + car.getHighPricedCar(carList));
	        System.out.println("Car with Lowest Price: " + car.getCarWithLowPricedCar(carList));
			//TODO
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
