package HomeWork;

import java.util.ArrayList;




public class StudentService {
	
	private ArrayList<Student> students;
	
	public StudentService()
	{
		setStudents(new ArrayList<Student>());
	}
	
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public void add(Student student)
	{
		students.add(student);
		System.out.println("Student is added");
	}
	public void delete(Student student)
	{
		students.remove(student);
		System.out.println("Student is deleted");
	}
	public void update(Student student)
	{
		int studentIndex = students.indexOf(student);
		students.set(studentIndex,student);
		System.out.println("Student is updated");
	}
	
	public ArrayList<Student> getAll()
	{
		return getStudents();
	}
	public Student getById (int id)
	{
		return students.stream().filter(i -> i.getId()==id).findFirst().get();
	}
	

}