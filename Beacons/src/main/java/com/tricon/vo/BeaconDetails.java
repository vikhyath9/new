package com.tricon.vo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Beacons")
public class BeaconDetails {
	@Id
	String id;
	
	String Uid;
	String Major;
	String Minor;
	
	String floor;
	String space;
	
		public BeaconDetails(String id, String uid, String major, String minor, String floor, String space) {
		
		this.Uid = uid;
		this.Major = major;
		this.Minor = minor;
		this.floor = floor;
		this.space = space;
	}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getUid() {
			return Uid;
		}

		public void setUid(String uid) {
			Uid = uid;
		}

		public String getMajor() {
			return Major;
		}

		public void setMajor(String major) {
			Major = major;
		}

		public String getMinor() {
			return Minor;
		}

		public void setMinor(String minor) {
			Minor = minor;
		}

		public String getFloor() {
			return floor;
		}

		public void setFloor(String floor) {
			this.floor = floor;
		}

		public String getSpace() {
			return space;
		}

		public void setSpace(String space) {
			this.space = space;
		}
	
	
	

}
