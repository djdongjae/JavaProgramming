package hansotbap.week06.lib;

public abstract class Airplane {
	
	private String id;
	private String type;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Airplane(String id, String type) {
		this.id = id;
		this.type = type;
	}
	
	public abstract void showInfo();
	
	public abstract void takeoff();
	
	public abstract void landing();
	
	public abstract void flight();

}
