package io.naakela.ride.common;

import java.util.Date;
import java.util.List;

public interface Ride {

	public User getDriver();
	
	public List<User> getRiders();
	
	public Date getRideDate();
}
