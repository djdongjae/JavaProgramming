package hansotbap.week05.exam03;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double result1 = MyMetric.kiloToMile(1.0);
		System.out.println("1km를 마일로 바꾸면 " + result1);
		
		double result2 = MyMetric.mileToKilo(1.0);
		System.out.println("1mile을 km로 바꾸면 " + result2);
	}

}
