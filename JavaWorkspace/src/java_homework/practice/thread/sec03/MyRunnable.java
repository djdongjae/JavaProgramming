package java_homework.practice.thread.sec03;

public class MyRunnable implements Runnable{
	String myname;
	public MyRunnable(String name) {
		myname = name;
	}
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(myname + i + " ");
		}
	}
}
