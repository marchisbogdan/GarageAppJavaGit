package cs.ubbcluj.ro.garage.model;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;
import ro.ubbcluj.cs.garage.model.Car;
import ro.ubbcluj.cs.garage.model.Client;
import cs.ubbcluj.ro.garage.model.*;

public class MockFactory extends TestCase {

	public static final String TESLA = "Tesla";
	public static final String T = "T";
	public static final String ZORILOR = "Zorilor";
	public static final String MIKE = "Mike";

	public static Client createMike(){
		Client client = new Client();
		client.setId(1);
		client.setName(MIKE);
		client.setAdress(ZORILOR);
		
		//client.setMasini(masini);
		return client;
	}
	
	public static Car createTesla(){
		Car car = new Car();
		car.setId(1);
		car.setModel(T);
		car.setType(TESLA);
		return car;
	}

}
