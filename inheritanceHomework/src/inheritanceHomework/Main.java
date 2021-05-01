package inheritanceHomework;


import entity.Instructor;
import entity.Student;
import service.InstructorManager;
import service.StudentManager;

public class Main {

	public static void main(String[] args) {
		Instructor instructor=new Instructor(1,"Engin","Demiroğ" , "test@mail.com", "Clean Code");
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor); 
		
		Student student1=new Student();
		student1.setId(1);
		student1.setName("Ömer");
		Student student2=new Student(2,"Karcan","Özbal","test2@mail.com");
		Student student3=new Student(2,"Ayşe","Fatma","test3@mail.com");
		
		StudentManager studentManager1=new StudentManager(); 
		studentManager1.add(student1);
		studentManager1.add(student2);
		studentManager1.add(student3);
		
	}

}
