package eCommerceSystem.googleRegister;

public class GoogleRegister {
	private static final String EMAIL="eomeracar@gmail.com";
	private static final String PASSWORD="test";	
	
	public boolean register(String email,String password)
	{
		if(EMAIL==email&&PASSWORD==password)
		{
		return true;
		}
		return false;
	}
}
