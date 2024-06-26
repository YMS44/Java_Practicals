package day2;

public class Student {
	private int id;
	private String name;
	private double score;
	private static int count = 0;
	
//	default parameter
	public Student()
	{
		count++;
		id = 1;
		name = "Ajay";
		score = 45.9;
//		this(2, "Ajay", 45.8);
	}
	
	public Student(int id, String name, double score) {
		count++;
		this.id = id;
		this.name = name;
		this.score = score;
	}
	
	public Student(String sname, double score) {
		count++;
		name = sname;
		this.score = score;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student:[Student id: "+id+", Studentname: "+name+", Score: "+score+"]" + count;
	}
	
	public String displayCount() {
		return "Total Students: "+count;
	}
}
