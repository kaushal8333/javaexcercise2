package com.ig.impl;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.ig.model.Car;
import com.ig.service.CarService;

public class CarImpl implements CarService{

	@Override
	public double sumOfPrices(List<Car> carList) {
		double sumi=carList.stream().map(x->x.getPrice()).reduce((a,b)->a+b).orElse(0.0);
		// TODO Auto-generated method stub
		return sumi;
	}

	@Override
	public List<String> getCarNames(List<Car> carList) {
		List<String> carNames=carList.stream().map(x->x.getCarName()).collect(Collectors.toList());
		// TODO Auto-generated method stub
		return carNames;
	}

	@Override
	public Set<String> getCarMakers(List<Car> carList) {
		Set<String> carMakers=carList.stream().map(x->x.getCareMake()).collect(Collectors.toSet());
		// TODO Auto-generated method stub
		return carMakers;
		// TODO Auto-generated method stub
	}

	@Override
	public double getHighPricedCar(List<Car> carList) {
		double res=carList.stream().map(x->x.getPrice()).max((c1,c2)->Double.compare(c1, c2)).orElse(0.0);
		// TODO Auto-generated method stub
		return res;
	}

	@Override
	public Car getCarWithLowPricedCar(List<Car> carList) {
		Car lowCar=carList.stream().min((c1,c2)->Double.compare(c1.getPrice(), c2.getPrice())).orElse(null);

		// TODO Auto-generated method stub
		return lowCar;
	}

}
