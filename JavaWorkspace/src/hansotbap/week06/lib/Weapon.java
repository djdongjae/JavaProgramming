package hansotbap.week06.lib;

public interface Weapon {
	
	String[] WEAPON_LIST = new String[] {"미사일", "레이저", "폭탄"};
	
	public void loadWeapon();
	
	public void showWeapon();
	
	public void selectWeapon();

}
