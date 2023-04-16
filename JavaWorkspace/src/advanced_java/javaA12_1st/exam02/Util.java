package advanced_java.javaA12_1st.exam02;

public class Util {
	public static <T> void print(T t) {
		System.out.println(t + " ");
	}
	
	public static <T> void printWithParenthesis(T t) {
		System.out.print("(" + t + ")");
	}

}
