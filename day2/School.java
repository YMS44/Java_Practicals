package day2;

public class School {
	public static void main(String [] args) {
		Student s1 = new Student();
//		Student s2 = new Student(2, "Bhusan", 56);
		Student s3 = new Student("Chetan", 68);
		System.out.println(s1.toString());
//		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s3.displayCount());

	}
}
