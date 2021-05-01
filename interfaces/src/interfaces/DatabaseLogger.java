package interfaces;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("Database is logged : "+ message);
	}

}
