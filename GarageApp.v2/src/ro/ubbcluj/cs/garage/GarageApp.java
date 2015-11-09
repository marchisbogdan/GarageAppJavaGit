package ro.ubbcluj.cs.garage;

import java.util.logging.Logger;

import ro.ubbcluj.cs.garage.repository.CarRepository;
import ro.ubbcluj.cs.garage.repository.ClientRepository;
import ro.ubbcluj.cs.garage.service.GarageManager;
import ro.ubbcluj.cs.garage.ui.GarageUI;

public class GarageApp {

	private static final Logger logger = Logger.getLogger(GarageApp.class.getName());
	
	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("Name parameter is invalid");
			System.exit(1);
		}
		logger.info("Stating application...");
		String name = args[0];
		try{
			GarageUI garageUI = new GarageUI();
			GarageManager garageManager = new GarageManager(name);
			garageUI.setGarageManager(garageManager);
			garageManager.setClientRepository(new ClientRepository());
			garageManager.setCarRepository(new CarRepository());
		}catch (Exception e){
			System.out.println("the app has encountered an error! ");
		}

	}

}
