package hansotbap.week06.lib;

public interface Weapon {
	
	public static final String[] WEAPON_LIST = {"미사일", "레이저", "폭탄"};
	
	public void loadWeapon();
	
	public void showWeapon();
	
	public void selectWeapon();

}
