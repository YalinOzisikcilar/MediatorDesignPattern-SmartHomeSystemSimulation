package simulator;


import controlPanel.ControlPanel;
import controlPanel.IControlPanel;
import smartHomeSystem.SmartHomeSystem;

public class Simulation {
	IControlPanel controlPanel;
	SmartHomeSystem smartHomeSystem;
	
	Simulation(){
		this.smartHomeSystem = new SmartHomeSystem();
		this.controlPanel = new ControlPanel(smartHomeSystem);
	}

	//run for 20 seconds. Each loop should have 1 second interval
	public void runSimulation() {

		smartHomeSystem.setupSystem();
		long startTime = System.currentTimeMillis();
		while (System.currentTimeMillis() - startTime < 20000) {
			
			smartHomeSystem.readSensorsAndAutomateActuators();
			controlPanel.randomCommand();
			System.out.println(smartHomeSystem.getSystemStateDescription());
		    try {
		        Thread.sleep(1000); // Sleep for 1 second
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    	}
			}
		
		}
	
	
}
