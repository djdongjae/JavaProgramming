package this_is_java_1회독.ch13.sec02.exam03;

public class Box<T> {
	public T content;
	
	public boolean compare(Box<T> other) {
		boolean result = content.equals(other.content);
		return result;
	}

}
