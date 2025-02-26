package com.ig.service;

import java.util.List;
import java.util.Set;

import com.ig.model.Car;

public interface CarService {
	public double sumOfPrices(List<Car> carList);
	public List<String> getCarNames(List<Car> carList);
	public Set<String> getCarMakers(List<Car> carList);
	//returns price of the car which has highest price
	public double getHighPricedCar(List<Car> carList);
	//returns Car which has lowest price
	public Car getCarWithLowPricedCar(List<Car> carList);
}
