package cs.ubbcluj.ro.garage.model;

import junit.framework.TestCase;
import ro.ubbcluj.cs.garage.model.Car;
import ro.ubbcluj.cs.garage.model.Client;
import ro.ubbcluj.cs.garage.model.Client.Address;

public class MockFactory extends TestCase {

	private static final int _1995 = 1995;
	private static final int _11 = 11;
	private static final int _24 = 24;
	public static final boolean FUNCTIONAL = true;
	public static final String TESLA = "Tesla";
	public static final String T = "T";
	public static final String ZORILOR = "Zorilor";
	public static final String MIKE = "Mike";

	public static Client createMike(){
		Client client = new Client();
		Address address = client.getAdress();
		client.setId(1);
		client.setName(MIKE);
		
		////// address class initialization////
		address.setDay(_24);
		address.setMonth(_11);
		address.setYear(_1995);
		//////////////////////////
		client.setAdress(address);
		//client.setMasini(cars);
		return client;
	}
	
	public static Car createTesla(){
		Car car = new Car();
		car.setId(1);
		car.setModel(T);
		car.setType(TESLA);
		car.setFunctional(FUNCTIONAL);
		return car;
	}

}
