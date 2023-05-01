package hansotbap.week04.exam07;

public class Movie {

	private String title;
	private String director;
	private String year;
	private String actor;
	private String score;

	public Movie(String title, String director, String year, String actor, String score) {
		this.title = title;
		this.director = director;
		this.year = year;
		this.actor = actor;
		this.score = score;
	}
	
	public String toString() {
		return String.format("""
				제목: %s
				감독: %s
				연도: %s
				주연배우: %s
				평점: %s
				""", title, director, year, actor, score);

	}
}
