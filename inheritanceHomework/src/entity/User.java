package entity;

public class User {
	private int _id;
	private String _name;
	private String _surname;
	private String _mail;
	public User() {
		
	}
	public User(int id,String name,String surname,String mail) {
		setId(id);
		setName(name);
		setSurname(surname);
		setMail(mail);
		
	}
	public int getId() {
		return _id;
	}
	public void setId(int _id) {
		this._id = _id;
	}
	public String getName() {
		return _name;
	}
	public void setName(String _name) {
		this._name = _name;
	}
	public String getSurname() {
		return _surname;
	}
	public void setSurname(String _surname) {
		this._surname = _surname;
	}
	public String getMail() {
		return _mail;
	}
	public void setMail(String _mail) {
		this._mail = _mail;
	}
	
	
	
}
