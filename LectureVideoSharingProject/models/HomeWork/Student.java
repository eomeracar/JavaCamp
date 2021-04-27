package HomeWork;

public class Student extends User {
	public Student(int id,String name,String surname,String mail,String description)
	{
		super.setId(id);
		super.setName(name);
		super.setSurname(surname);
		super.setMail(mail);
		super.setDescription(description);
	}
}
