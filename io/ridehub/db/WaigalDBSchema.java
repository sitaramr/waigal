package io.ridehub.db;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

@Resource
public class WaigalDBSchema {
	
	public static final String DB_NAME = "waigal";
	
	public enum COLLECTION {
		USERS(getUserKeys()),RIDES(getRideKeys());
		public Set<String> keys;
		private COLLECTION(Set<String> keys) {
			this.keys = keys;
		}
	}
	
	public enum USER_KEY {
		USER_ID,FIRSTNAME,LASTNAME,EMAIL,CELLPHONE;
	}

	public enum RIDE_KEY {
		RIDE_ID,DRIVER_ID,TIMESTAMP,STARTLOCATION;
	}

	private static Set<String> getUserKeys() {
		Set<String> keys = new HashSet<String>();
		Arrays.asList(USER_KEY.values()).stream().forEach(key -> keys.add(key.name()));
		return keys;
	}
	
	private static Set<String> getRideKeys() {
		Set<String> keys = new HashSet<String>();
		Arrays.asList(RIDE_KEY.values()).stream().forEach(key -> keys.add(key.name()));
		return keys;
	}
	
}
