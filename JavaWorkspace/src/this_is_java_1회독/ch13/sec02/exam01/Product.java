package this_is_java_1회독.ch13.sec02.exam01;

public class Product<K, M> {
	
	private K kind;
	private M model;
	
	public K getKind() {
		return this.kind;
	}
	
	public M getModel() {
		return this.model;
	}
	
	public void setKind(K kind) {
		this.kind = kind;
	}
	
	public void setModel(M model) {
		this.model = model;
	}

}
