package java_homework.practice.thread.sec02;

public class MyRunnableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new MyRunnable());
		t.start();

	}

}
