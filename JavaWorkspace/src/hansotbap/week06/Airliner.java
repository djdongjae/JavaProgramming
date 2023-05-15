package hansotbap.week06;

public class Airliner extends Airplane {
	
	private int passenger;
	
	public int getPassenger() {
		return passenger;
	}

	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}

	public Airliner(String id) {
		super(id, "여객기");
		this.passenger = 0;
	}
	
	public Airliner(String id, int passenger) {
		super(id, "여객기");
		this.passenger = passenger;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("탑승 인원수: " + this.passenger);
		System.out.println();
	}
	
	
}
