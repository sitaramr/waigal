package io.naakela.ride.notification;

import io.naakela.ride.common.User;

public interface Notification {

	public void sendSMSMessage(User user, String message);
	
	public void sendEmailMessage(User user, String message);
}
