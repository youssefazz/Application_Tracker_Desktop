package entity;

import java.io.Serializable;
import java.util.Date;



public class Position implements Serializable{

	private long id;
	private String latitude;
	private String longitude;
	private Date date;
	private SmartPhone smartphone;
	
	public Position() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Position(String latitude, String longitude, Date date, SmartPhone smartphone) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.date = date;
		this.smartphone = smartphone;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public SmartPhone getSmartphone() {
		return smartphone;
	}
	public void setSmartphone(SmartPhone smartphone) {
		this.smartphone = smartphone;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@Override
	public String toString() {
		return "Position [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", date=" + date
				+ ", smartphone=" + smartphone + "]";
	}
	
	
}
