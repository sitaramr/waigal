package io.ridehub.hub;

import java.util.Date;

import io.ridehub.location.Location;
import io.ridehub.ride.Ride;
import io.ridehub.search.RideSearchCriteria;
import io.ridehub.user.User;

public interface RideHub {
	
	public void createRide(User driver, Date date, Location startLocation, Location endLocation, 
			int rideCapacity);
	
	public void saveRide(Ride ride);
	
	public void deleteRide(Ride ride);
	
	public Ride searchForRide(RideSearchCriteria criteria);
	
	public void addRider(Ride ride);
	
	public void removeRide(Ride ride);

}
