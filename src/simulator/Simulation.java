package simulator;

import controlPanel.IControlPanel;
import smartHomeSystem.SmartHomeSystem;

public class Simulation {
	IControlPanel controlPanel;
	SmartHomeSystem smartHomeSystem;
	
	public Simulation(IControlPanel controlPanel) {
		this.controlPanel = controlPanel;
		this.smartHomeSystem = new SmartHomeSystem(controlPanel);
	}

	public void runSimulation() {
		smartHomeSystem.setupSystem();
		smartHomeSystem.automateLight();
		smartHomeSystem.automateDoorLock();
		System.out.println(smartHomeSystem.getSystemStateDescription());
	}
}
