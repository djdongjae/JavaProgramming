package java_homework.practice.thread.sec03;

public class MyRunnableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new MyRunnable("A"));
		Thread t2 = new Thread(new MyRunnable("B"));
		t1.start();
		t2.start();
		for(int i=1; i<=5; i++) {
			System.out.println("main" + i + " ");
		}

	}

}
