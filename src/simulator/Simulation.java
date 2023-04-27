package simulator;

import java.util.Random;

import controlPanel.IControlPanel;
import smartHomeSystem.Signal;
import smartHomeSystem.SmartHomeSystem;

public class Simulation {
	IControlPanel controlPanel;
	SmartHomeSystem smartHomeSystem;
	
	public Simulation(IControlPanel controlPanel) {
		this.controlPanel = controlPanel;
		this.smartHomeSystem = new SmartHomeSystem(controlPanel);
	}

	//run for 20 seconds. Each loop should have 1 second interval
	public void runSimulation() {
		smartHomeSystem.setupSystem();
		long startTime = System.currentTimeMillis();
		while (System.currentTimeMillis() - startTime < 20000) {
			smartHomeSystem.automateLight();
			smartHomeSystem.automateDoorLock();
			System.out.println(smartHomeSystem.getSystemStateDescription());
		    try {
		        Thread.sleep(1000); // Sleep for 1 second
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    	}
			}
		
		}
	
	private void runRandomCommand() {
		Random random = new Random();
		int randomInt = random.nextInt(5);
		if(randomInt==0) {
			
		}
	}
}
