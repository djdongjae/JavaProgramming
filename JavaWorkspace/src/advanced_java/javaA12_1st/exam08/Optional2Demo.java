package advanced_java.javaA12_1st.exam08;

import java.util.Optional;

import advanced_java.javaA12_1st.exam02.Util;

public class Optional2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = null;
		Optional<String> o = Optional.ofNullable(s1);
		
		if(s1 != null) 
			Util.print(s1);
		else
			Util.print("없음");
		
		if(o.isPresent())
			Util.print(o.get());
		else
			Util.print("없음");
		
		String s2 = o.orElse("없음");
		Util.print(s2);
		
		o.ifPresentOrElse(Util::print, () -> System.out.println("없음"));

	}

}
