package ro.ubbcluj.cs.garage.service;

import java.util.logging.Logger;

import ro.ubbcluj.cs.garage.repository.CarRepository;
import ro.ubbcluj.cs.garage.repository.ClientRepository;

public class GarageManager {

	//Attributes
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private String fileName = null;
	private ClientRepository clientRepo;
	private CarRepository carRepo;
	
	//Methods
	public GarageManager(String fileName) {
		this.fileName = fileName;
	}

	public void setClientRepository(ClientRepository clientRepository) {
		this.clientRepo = clientRepository;
	}

	public void setCarRepository(CarRepository carRepository) {
		this.carRepo = carRepository;
	}
	
}
