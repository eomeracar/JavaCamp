package entity;

public class Student extends User{

	private static int STUDENTNO;
	public Student() {
		STUDENTNO=1;
	}
	public Student(int id,String name,String surname,String mail) {
		super(id, name, surname, mail);
	}
	public int getStudentNo() {
		return STUDENTNO++;
	}
}
