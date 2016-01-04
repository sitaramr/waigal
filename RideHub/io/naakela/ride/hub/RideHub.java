package io.naakela.ride.hub;

import java.util.Date;

import io.naakela.ride.common.Location;
import io.naakela.ride.common.Ride;
import io.naakela.ride.common.User;
import io.naakela.ride.search.RideSearchCriteria;

public interface RideHub {
	
	public void createRide(User driver, Date date, Location startLocation, Location endLocation, 
			int rideCapacity);
	
	public void saveRide(Ride ride);
	
	public void deleteRide(Ride ride);
	
	public Ride searchForRide(RideSearchCriteria criteria);
	
	public void addRider(Ride ride);
	
	public void removeRide(Ride ride);

}
