package com.insight.practice;

class BookingJob{
	boolean isAvail=true;
	public boolean availability() {
		return isAvail;
	}
	public synchronized void ConferenceRoomBookingJob() {
		if(availability()) {
			System.out.println("Available");
		}
		System.out.println("Booking in progress");
		System.out.println("Booking done");
	}

}


public class Manager extends Thread{
	@Override
	public void run() {
		b.ConferenceRoomBookingJob();
	}
	BookingJob b;
	Manager(BookingJob b){
		this.b=b;
		
	}
	public static void main(String[] args) {
		BookingJob b=new BookingJob();
		Manager m1=new Manager(b);
		m1.start();
		Manager m2=new Manager(b);
		m2.start();
	}

}
