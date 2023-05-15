package hansotbap.week06;

public class Fighter extends Airplane{
	
	private boolean stealth;
	
	public Fighter(String id) {
		super(id, "전투기");
		this.stealth = false;
	}
	
	public Fighter(String id, boolean stealth) {
		super(id, "전투기");
		this.stealth = stealth;
	}
	
	public void stealthOn() {
		this.stealth = true;
	}
	
	public void stealthOff() {
		this.stealth = false;
	}
	
	public boolean getStealth() {
		return this.stealth;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("스텔스 모드: " + getStealth());
		System.out.println();
	}

}
