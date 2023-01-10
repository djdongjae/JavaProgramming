package this_is_java_1회독.ch06.sec15;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
	}
	
	static Singleton getInstance() {
		return singleton;
	}

}
