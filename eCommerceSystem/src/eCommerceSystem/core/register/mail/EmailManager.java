package eCommerceSystem.core.register.mail;

public class EmailManager implements EmailService{

	@Override
	public void sendMail(String to, String message) {
		// TODO Auto-generated method stub
		System.out.println("Mail is sended to "+to);
	}

}
