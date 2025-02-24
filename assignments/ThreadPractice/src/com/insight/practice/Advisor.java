package com.insight.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

class DemoArray {
	List<String> l=Arrays.asList("Advise1","Advise2","Advise3","Advise4","Advise5","Advise6","Advise7");
	
	public void printAdvise() {
		System.out.println(l.get(new Random().nextInt(l.size())));

	}
}


public class Advisor extends Thread{
	DemoArray da;
	Advisor(DemoArray da){
		this.da=da;
	}
	@Override
	public void run() {
		da.printAdvise();
	}
	public static void main(String[] args) {
		DemoArray da=new DemoArray();
		Advisor adv1=new Advisor(da);
		adv1.start();
		Advisor adv2=new Advisor(da);
		adv2.start();
	}
}