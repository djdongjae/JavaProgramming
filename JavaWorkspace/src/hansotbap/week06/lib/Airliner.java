package hansotbap.week06.lib;

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
		System.out.println("식별번호: " + this.getId());
		System.out.println("비행기 타입: " + this.getType());
		System.out.println("탑승 인원수: " + this.passenger);
	}

	@Override
	public void takeoff() {
		System.out.println("여객기 " + this.getId() + "가 이륙합니다.");
	}

	@Override
	public void landing() {
		System.out.println("여객기 " + this.getId() + "가 착륙합니다.");
	}

	@Override
	public void flight() {
		System.out.println("여객기 " + this.getId() + "가 비행합니다.");
	}
	
	
}
