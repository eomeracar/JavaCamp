package entity;

public class Instructor extends User{
	private String _favoriteBook;
	public Instructor() {

	}
	public Instructor(int id,String name,String surname,String mail,String favoriteBook) {
		super(id, name, surname, mail);
		set_favoriteBook(favoriteBook);
	}
	public String get_favoriteBook() {
		return _favoriteBook;
	}
	public void set_favoriteBook(String _favoriteBook) {
		this._favoriteBook = _favoriteBook;
	}

}
