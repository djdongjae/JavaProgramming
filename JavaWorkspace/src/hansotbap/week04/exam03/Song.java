package hansotbap.week04.exam03;

public class Song {
	
	private String title;
	private String artist;
	private int length;
	
	public Song(String title, String artist, int length) {
		this.title = title;
		this.artist = artist;
		this.length = length;
	}
	
	public Song(String title, String artist) {
		this(title, artist, 230);
	}
	
	public Song(String title) {
		this(title, "beetles");
	}
	
	public Song() {
		this("let it be");
	}
	
	public String toString() {
		return String.format("Song (title=%s, artist=%s, length=%s)", title, artist, length);
	}

}
