package com.staticexample;
class Withdraw implements Runnable {
	@Override
	public void run() {
		withdraw(1000);
	}
	private void withdraw(int i) {
		// business login to check balance and than withrwaw
		// update the balance
	}
}




class MyThread extends  Thread{
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			try {
				//Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			String name = Thread.currentThread().getName();
			System.out.println("Thread Name : "+ name + ", i: " + i);
		}
	}
}


public class ThreadDemo extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				//Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			String name = Thread.currentThread().getName();
			System.out.println("Thread Name : "+ name + ", i: " + i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("start");
		new ThreadDemo().start();
		new ThreadDemo().start();
	
		// BankAccount ba = new BankAccount(123);
		// ba.withdraw(2000);
		// Thread user1 = new Thread(ba);
		// Thread user2 = new Thread(ba);
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.setPriority(10);
		//t.setDaemon(true);
		t.setName("A");
		t.start();
		Thread t1 = new Thread(mt,"B");
		//t1.setDaemon(true);
		//t1.setName("B");
		t1.start();
		
	for (int j = 0; j < 10; j++) {
			String name = Thread.currentThread().getName();
			System.out.println("Thread Name : "+ name + ", j: " + j);
			
		}
		
		System.out.println(Thread.activeCount());
		System.out.println("End");
		
	}
	

}
