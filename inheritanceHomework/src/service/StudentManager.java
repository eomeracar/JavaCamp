package service;

import entity.Student;
import entity.User;

public class StudentManager extends UserManager {
	private Student _student;
	public StudentManager() {
		_student=new Student();
	}
	public StudentManager(Student student) {
		this.add(student);
	}
	@Override
	public void add(User user) {
		_student=(Student)user;
		System.out.println(_student.getName()+" IS ADDED!"
				+"\nAlso,the student number is "+_student.getStudentNo());
	}
}
