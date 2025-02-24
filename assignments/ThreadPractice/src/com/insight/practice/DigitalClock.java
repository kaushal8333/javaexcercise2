package com.insight.practice;

import java.time.LocalTime;

public class DigitalClock extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println(LocalTime.now());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		DigitalClock dc=new DigitalClock();
		dc.start();
	}
}
