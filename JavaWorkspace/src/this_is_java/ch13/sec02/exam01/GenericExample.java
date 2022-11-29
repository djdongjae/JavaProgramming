package this_is_java.ch13.sec02.exam01;

public class GenericExample {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<>();
		
		product1.setKind(new Tv());
		product1.setModel("스마트 Tv");
		
		Tv kind1 = product1.getKind();
		String model1 = product1.getModel();
		
		Product<Car, String> product2 = new Product<>();
		
		product2.setKind(new Car());
		product2.setModel("포르쉐");
		
		Car kind2 = product2.getKind();
		String model2 = product2.getModel();
	}
}