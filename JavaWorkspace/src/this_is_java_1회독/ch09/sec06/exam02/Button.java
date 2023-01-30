package this_is_java_1회독.ch09.sec06.exam02;

public class Button {
	
	public static interface ClickListener {
		void onClick();
	}
	
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}

}
