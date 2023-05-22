package hansotbap.week06.lib;

import java.util.Scanner;

public class Fighter extends Airplane implements Weapon  {
	
	Scanner sc = new Scanner(System.in);
	
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
	}

	@Override
	public void takeoff() {
		// TODO Auto-generated method stub
		System.out.println("전투기 " + this.getId() + "가 이륙합니다.");
	}

	@Override
	public void landing() {
		// TODO Auto-generated method stub
		System.out.println("전투기 " + this.getId() + "가 착륙합니다.");
	}

	@Override
	public void flight() {
		// TODO Auto-generated method stub
		System.out.println("전투기 " + this.getId() + "가 비행합니다.");
	}

	@Override
	public void loadWeapon() {
		// TODO Auto-generated method stub
		System.out.println(this.getId() + " 무기 장착");
		for(String weapon : WEAPON_LIST) {
			System.out.println(weapon + " 무기가 장착되었습니다.");
		}
	}

	@Override
	public void showWeapon() {
		// TODO Auto-generated method stub
		System.out.println(this.getId() + " 무기 목록");
		for(int i=0; i < WEAPON_LIST.length; i++) {
			System.out.println(i+1 + ": " + WEAPON_LIST[i]);
		}
	}

	@Override
	public void selectWeapon() {
		// TODO Auto-generated method stub
		System.out.print("무기를 선택하시오: ");
		int index = sc.nextInt() - 1;
		System.out.println("\n" + WEAPON_LIST[index] + "이(가) 발사되었습니다.");
	}

}
