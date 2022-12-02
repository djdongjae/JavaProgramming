package this_is_java.ch13.sec02.exam01;

public class Product<K, M> {
	
	private K kind;
	private M model;
	
	public K getKind() {
		return kind;
	}
	public M getModel() {
		return model;
	}
	
	public void setKind(K kind) {
		this.kind = kind;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
}