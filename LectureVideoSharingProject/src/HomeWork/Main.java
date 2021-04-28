package HomeWork;


public class Main {

	public static void main(String[] args) {
		Instructor instructor1 =new Instructor(1,"Engin","Demiroğ","test4@gmail.com","test4");
		Instructor instructor2 = new Instructor();
		instructor2.setId(2);
		instructor2.setName("Tuğrul");
		instructor2.setSurname("Bayrak");
		instructor2.setMail("test");
		
		InstructorService instructorService=new InstructorService();
		instructorService.add(instructor1);
		instructorService.add(instructor2);
		
		for (Instructor instructor : instructorService.getAll()) {
			System.out.println(instructor.getId()+" "+instructor.getName()+" "+instructor.getSurname());
		}
		instructor2.setName("test");
		instructorService.update(instructor2);
		
		for (Instructor instructor : instructorService.getAll()) {
			System.out.println(instructor.getId()+" "+instructor.getName()+" "+instructor.getSurname());
		}
		
		Instructor tempInstructor=instructorService.getById(1);
		System.out.println(tempInstructor.getId()+" "+tempInstructor.getName()+" "+tempInstructor.getSurname()+" "+tempInstructor.getMail());
		
		System.out.println("-------------------------------");

		Student student1=new Student(1,"Ömer","Acar","test1@gmail.com","test1");
		Student student2=new Student(2,"Karcan","Özbal","test2@gmail.com","test2");
		Student student3=new Student(3,"Uğur","Yıldız","test3@gmail.com","test3");
		Student student4=new Student(4,"John","Unexpected","test4@gmail.com","test4");
		
		/*git bash test*/
		StudentService studentService=new StudentService();
		studentService.add(student1);
		studentService.add(student2);
		studentService.add(student3);
		studentService.add(student4);
		
		for (Student student : studentService.getAll()) {
			System.out.println(student.getId()+" "+student.getName()+" "+student.getSurname()+" "+student.getMail());
		}
		
		System.out.println("-------------------------------");
		
		Lecture lecture1=new Lecture();
		lecture1.setId(1);
		lecture1.setName("C#");
		lecture1.setDescription("C# OOP2");
		
		Lecture lecture2=new Lecture();
		lecture2.setId(2);
		lecture2.setName("Java");
		lecture2.setDescription("Java OOP3");
		
		
		LectureService lectureService=new LectureService();
		
		lectureService.add(lecture1);
		lectureService.add(lecture2);
		
		for (Lecture lecture : lectureService.getAll()) {
			System.out.println(lecture.getId()+" "+lecture.getName()+" --> "+lecture.getDescription());
		}
		
		lectureService.delete(lecture2);
		
		for (Lecture lecture : lectureService.getAll()) {
			System.out.println(lecture.getId()+" "+lecture.getName()+" --> "+lecture.getDescription());
		}
		
	
	
	}

}
