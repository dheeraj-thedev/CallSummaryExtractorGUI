package com.trainingbasket.callsummaryextractor.threads;

import java.sql.Time;
import java.time.LocalTime;

public class TImer implements Runnable{
	/*public static void main(String[] args) {
		Thread th = new Thread(new TimerRunner());
		th.start();	
	}*/
	@Override
	public void run() {
		getTimer();
	}

	public void getTimer() {
		try {
			while (true) {
				Thread.sleep(1000);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

class TimerRunner implements Runnable {
	@Override
	public void run() {
		getTimer();
	}

	public void getTimer() {
		try {
			while (true) {
				Thread.sleep(1000);
				System.out.println(LocalTime.now());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
