package java_homework.practice.thread.sec01;

public class MyThread extends Thread {
	public void run() {
		for (int i=10 ; i>=0 ; i--) {
			System.out.print(i + " ");
		}
	}

}
