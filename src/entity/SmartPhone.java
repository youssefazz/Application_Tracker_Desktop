package entity;

import java.io.Serializable;

public class SmartPhone implements Serializable{
    private static final long serialVersionUID = -4306666097252500126L;
	private long id;
	private String imei;
	private User user;

	public SmartPhone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SmartPhone(String imei, User user) {
		super();
		this.imei = imei;
		this.user = user;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "SmartPhone [id=" + id + ", imei=" + imei + ", user=" + user + "]";
	}
	
	
	
}
