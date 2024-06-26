package day7;

public class Article{
	int id;
	int year;
	String subject;
	int views;
	public Article(int id,String subject,  int year, int views) {
		super();
		this.id = id;
		this.year = year;
		this.subject = subject;
		this.views = views;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", year=" + year + ", subject=" + subject + ", views=" + views + "]";
	}
	
	

}
