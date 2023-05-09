package hansotbap.week05.exam05;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle[] array = new Circle[3];
		
		for(int i=0; i<3; i++) {
			array[i] = new Circle((int)(Math.random()*100));
		}
		
		for(Circle c : array) {
			System.out.println(c.toString());
		}
	}

}
