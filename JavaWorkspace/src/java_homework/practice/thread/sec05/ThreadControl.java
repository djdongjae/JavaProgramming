package java_homework.practice.thread.sec05;

public class ThreadControl {
	
	static void print(String message) {
		String threadName = Thread.currentThread().getName();
		System.out.format("%s: %s%n", threadName, message);
	}
	
	private static class MessageLoop implements Runnable {
		public void run() {
			String[] messages = {"apple", "basket", "candy", "dog"};
			try {
				for(int i=0; i<messages.length; i++) {
					print(messages[i]);
					Thread.sleep(2000);
				}
			} catch (InterruptedException e) {
				print("아직끝나지 않았어요!");
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		print("시작합니다.");
		int tries = 0;
		print("추가 스레드를 시작합니다.");
		Thread t = new Thread(new MessageLoop());
		t.start();
		while (t.isAlive()) {
			print("추가 스레드가 끝나기를 기다립니다.");
			t.join(1000);
			if (++tries > 2) {
				print("참을 수 없네요.");
				t.interrupt();
				t.join();
			}
		}
		print("메인 스레드 종료");
	}
}
