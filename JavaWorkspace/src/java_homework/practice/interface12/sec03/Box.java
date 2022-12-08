package java_homework.practice.interface12.sec03;

class Box implements Comparable {
	
	private double volume = 0.0;
	
	public Box(double v) {
		volume = v;
	}
	
	public int compareTo(Object otherObject) {
		Box other = (Box) otherObject;
		
		if (volume < other.volume) {return -1;}
		else if (volume > other.volume) return 1;
		else return 0;
	}

}
