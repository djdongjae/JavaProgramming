package hansotbap.week05.exam07;

public class Word {
	
	private String eng;
	private String kor;
	
	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}

	public Word(String eng, String kor) {
		this.eng = eng;
		this.kor = kor;
	}

}
