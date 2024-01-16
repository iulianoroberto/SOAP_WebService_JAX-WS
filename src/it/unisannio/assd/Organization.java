package it.unisannio.assd;

import java.io.Serializable;

public class Organization implements Serializable{

	private String name;
	private String id;
	private String address;
	
	public Organization() {}
	
	public Organization(String n, String i, String a) {
		name = n; id = i; address = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "Organization [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	
	
	
}
