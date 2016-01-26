package io.ridehub.event;
import io.ridehub.user.User;

public interface Notification {

	public void sendSMSMessage(User user, String message);
	
	public void sendEmailMessage(User user, String message);
}
