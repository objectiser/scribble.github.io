package smtp.message.client;

import smtp.Smtp.Smtp.Smtp;
import smtp.message.SmtpMessage;

public class Quit extends SmtpMessage
{
	private static final long serialVersionUID = 1L;

	public Quit()
	{
		super(Smtp.Quit);
	}
}
