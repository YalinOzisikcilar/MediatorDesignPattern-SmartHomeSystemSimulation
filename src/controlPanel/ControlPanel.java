package controlPanel;

import smartHomeSystem.SmartHomeSystem;

public class ControlPanel implements IControlPanel {
	SmartHomeSystem smartHomeSystem;
	
	public ControlPanel() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void turnOnLight() {
		
		smartHomeSystem.turnOnLight();
	}

	@Override
	public void turnOffLight() {
		
		smartHomeSystem.turnOffLight();
	}

	@Override
	public void lockDoor() {
		
		smartHomeSystem.lockDoor();	
	}

	@Override
	public void unlockDoor() {
		
		smartHomeSystem.unlockDoor();
	}

	@Override
	public void setTemperature(int temperature) {
		
		smartHomeSystem.setTemperature(temperature);
	}

	
}
