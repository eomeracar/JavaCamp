package service;

import entity.Instructor;
import entity.User;

public class InstructorManager extends UserManager {
	private Instructor _instructor;
	public InstructorManager() {
	_instructor = new Instructor();
	}
	
	@Override
	public void add(User user) {
		_instructor=(Instructor)user;
		System.out.println(_instructor.getName()
				+" IS ADDED! "
				+"\nAlso,His favorite book is "
				+_instructor.get_favoriteBook());
	}
}
