package HomeWork;

import java.util.ArrayList;

public class InstructorService {
	private ArrayList<Instructor> instructors;
	public InstructorService() {
		instructors =new ArrayList<Instructor>();
	}
	public void add(Instructor instructor) {
		instructors.add(instructor);
		System.out.println("Instructor is added");
	}
	public void delete(Instructor instructor)
	{
		instructors.remove(instructor);
		System.out.println("Instructor "+instructor.getName()+ " " +instructor.getSurname() +" is deleted");
	}
	public void update(Instructor instructor)
	{
		int indexInstructor=this.instructors.indexOf(instructor);
		System.out.println("Instructor "+instructor.getName()+ " " +instructor.getSurname() +" is updated");
		this.instructors.set(indexInstructor, instructor);
		
	}
	public ArrayList<Instructor> getInstructors() {
		return instructors;
	}
	public void setInstructors(ArrayList<Instructor> instructors) {
		this.instructors = instructors;
	}
	public ArrayList<Instructor> getAll(){
		return getInstructors();
	}
	public Instructor getById(int id)
	{
		return instructors.stream().filter(i-> i.getId()==id).findFirst().get();	
	}
}
