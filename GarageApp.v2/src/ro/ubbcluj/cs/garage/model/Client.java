package ro.ubbcluj.cs.garage.model;

import java.util.ArrayList;

public class Client {
	private int id;
	private String name;
	private Address address;
	private ArrayList<Car> cars;
	
	///////////////nested class Address////////////////////
	
	public class Address{
		//Attributes
		private int day;
		private int month;
		private int year;
		//Methods
		@Override
		public String toString() {
			return "Address [day=" + day + ", month=" + month + ", year=" + year + "]";
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + day;
			result = prime * result + month;
			result = prime * result + year;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Address other = (Address) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (day != other.day)
				return false;
			if (month != other.month)
				return false;
			if (year != other.year)
				return false;
			return true;
		}
		public int getDay() {
			return day;
		}
		public void setDay(int day) {
			this.day = day;
		}
		public int getMonth() {
			return month;
		}
		public void setMonth(int month) {
			this.month = month;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		private Client getOuterType() {
			return Client.this;
		}
		
		
	}
	////////////////////////////////////////////////////////
	
	
	public ArrayList<Car> getMasini() {
		return cars;
	}
	public void setMasini(ArrayList<Car> cars) {
		this.cars = cars;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdress() {
		return address;
	}
	public void setAdress(Address address) {
		this.address.setDay(address.getDay());
		this.address.setMonth(address.getMonth());
		this.address.setYear(address.getYear());
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((cars == null) ? 0 : cars.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (cars == null) {
			if (other.cars != null)
				return false;
		} else if (!cars.equals(other.cars))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
