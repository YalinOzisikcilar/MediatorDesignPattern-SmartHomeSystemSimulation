package controlPanel;

import smartHomeSystem.SmartHomeSystem;

public class ControlPanel implements IControlPanel {
	SmartHomeSystem smartHomeSystem;
	
	public ControlPanel(SmartHomeSystem smartHomeSystem) {
		this.smartHomeSystem = smartHomeSystem;
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

	@Override
	public void randomCommand() {
		int max = 5;
		int min = 1;
		int randomInt = (int)Math.floor(Math.random() * (max - min + 1) + min);
		switch(randomInt) {
			case 1:
				System.out.println("Turn on light command received..");
				this.turnOnLight();
				break;
			case 2:
				System.out.println("Turn off light command received..");
				this.turnOffLight();
				break;
			case 3: 
				System.out.println("Lock door command received..");
				this.lockDoor();
				break;
			case 4:
				System.out.println("Unlock door command received...");
				this.unlockDoor();
				break;
			case 5: 
				int maxTemp = 25;
				int minTemp = 20;
				int randomTemp = (int)Math.floor(Math.random() * (maxTemp - minTemp + 1) + minTemp);
				System.out.println("Temperature is set to: " + randomTemp);
				this.setTemperature(randomTemp);
				break;
		}
		
	}

	
}
