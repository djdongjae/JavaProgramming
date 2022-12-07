package java_homework.practice.thread.sec04;

public class MyThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new MyThread("A");
		Thread t2 = new MyThread("B");
		t1.start();
		t2.start();
		
		for(int i=1; i<=5; i++) {
			System.out.println("main" + i + " ");
		}

	}

}
