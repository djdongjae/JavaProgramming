package java_homework.practice.thread.sec04;

public class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}
	
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(getName() + i + " ");
		}
	}

}
