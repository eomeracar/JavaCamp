package HomeWork;

public class Main {

	public static void main(String[] args) {
		
		Student student1=new Student(1,"Ömer","Acar","test1@gmail.com","test1");
		Student student2=new Student(2,"Karcan","Özbal","test2@gmail.com","test2");
		Student student3=new Student(3,"Uğur","Yıldız","test3@gmail.com","test3");
		//Instructor instructor1 =new Instructor(1,"Engin","Demiroğ","test4@gmail.com","test4");
		Instructor instructor2 = new Instructor();
		instructor2.setId(2);
		instructor2.setName("Tuğrul");
		instructor2.setSurname("Bayrak");
		instructor2.setMail("test");
		Lecture lecture1=new Lecture();
		lecture1.setId(1);
		lecture1.setName("C#");
		lecture1.setDescription("C# OOP2");
		
		Lecture lecture2=new Lecture();
		lecture2.setId(2);
		lecture2.setName("Java");
		lecture2.setDescription("Java OOP3");
		
		StudentService studentService=new StudentService();
		studentService.add(student1);
		studentService.add(student2);
		studentService.add(student3);
		System.out.println("-------------------------------");
		for (Student student : studentService.getAll()) {
			System.out.println(student.getId()+" "+student.getName()+" "+student.getSurname()+" "+student.getMail());
		}
		System.out.println("-------------------------------");
		LectureService lectureService=new LectureService();
		
		lectureService.add(lecture1);
		lectureService.add(lecture2);
		System.out.println("-------------------------------");
		for (Lecture lecture : lectureService.getAll()) {
			System.out.println(lecture.getId()+" "+lecture.getName()+" "+lecture.getDescription());
		}
		System.out.println("-------------------------------");
		lectureService.delete(lecture2);
		System.out.println("-------------------------------");
		for (Lecture lecture : lectureService.getAll()) {
			System.out.println(lecture.getId()+" "+lecture.getName()+" "+lecture.getDescription());
		}
		
		
	}

}
