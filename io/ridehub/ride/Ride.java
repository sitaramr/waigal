package io.ridehub.ride;

import java.util.Date;
import java.util.List;

import io.ridehub.user.User;

public interface Ride {

	public User getDriver();
	
	public List<User> getRiders();
	
	public Date getRideDate();
}
