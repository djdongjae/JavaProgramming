package java_homework.practice.thread.sec02;

public class MyRunnable implements Runnable{
	public void run(){
		for(int i=10 ; i>=0 ; i--) {
			System.out.println(i + " ");
		}
	}

}
