package advanced_java.javaA10_1st.exam04;

interface NewObject<T> {
	T getObject(T o);
}

interface NewArray<T> {
	T[] getArray(int size);
}

public class ConstructorRefDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewObject<String> s;
		NewArray<Integer> i;
		
		s = String::new;
		String str = s.getObject("사과");
		
		i = Integer[]::new;
		Integer[] array = i.getArray(2);
		array[0] = 10;
		array[1] = 20;
		
	}

}
