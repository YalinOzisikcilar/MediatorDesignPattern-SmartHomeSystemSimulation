package smartHomeSystem;

import java.util.HashMap;

import controlPanel.IControlPanel;

public class SmartHomeSystem {
	private HashMap<String, Sensor> sensors;
	private HashMap<String, Actuator> actuators;
	private int goalTemperature;


	public SmartHomeSystem() {

	}
	
	public String getSystemStateDescription() { //get all actuators state description
		StringBuilder sb = new StringBuilder();
		for (HashMap.Entry<String, Actuator> entry : actuators.entrySet()) {
		    Actuator actuator = entry.getValue();
		    sb.append(actuator.getStateDescription()).append("\n");
		    
		}
		String result = sb.toString();
		return result;
	}
	
	public void automateDoorLock() {
		Signal motionSignal = readMotionSensor();
		DoorLock doorLock = (DoorLock) actuators.get("doorLock");
		if( motionSignal == Signal.HIGH) {
			doorLock.unlockDoor();
		}
		else {
			doorLock.lockDoor();
		}
	}
	
	private Signal readMotionSensor() {
		Signal signal = this.getSensor("motionSensor").readSensor();
		return signal;
	}
	
	public void automateTemperature(){
		int currentTemperature = readTempSensor();
		Thermostat thermostat = (Thermostat) actuators.get("thermostat");
		if(currentTemperature > goalTemperature) {
			thermostat.decreaseTemperature();
		}
		else if(currentTemperature < goalTemperature) {
			thermostat.increaseTemperature();
		}
		else {
			thermostat.closeThermostat();
		}
	}
	
	private int readTempSensor() {
		int currentTemperature = ((TemperatureSensor) this.getSensor("temperatureSensor")).readSensorValue();
		return currentTemperature;
	}
	
	
	public void automateLight(){
			Signal lightSignal = readLightSensor();
			LightBulb lightBulb = (LightBulb) actuators.get("lightBulb");
			if(lightSignal == Signal.HIGH) {
				lightBulb.turnOff();
			}
			else if(lightSignal == Signal.LOW) {
				lightBulb.turnOn();
			}
			//Do nothing if the signal is Neutral
		}
	
	
	private Signal readLightSensor() {
		Signal signal = this.getSensor("lightSensor").readSensor();
		return signal;
	}
	
	

	public void setupSystem() {
		this.sensors = new HashMap<>();
        sensors.put("lightSensor", new LightSensor());
        sensors.put("motionSensor", new MotionSensor());
        sensors.put("temperatureSensor", new TemperatureSensor());
        
        this.actuators = new HashMap<>();
        actuators.put("lightBulb", new LightBulb());
        actuators.put("doorLock", new DoorLock());
        actuators.put("thermostat", new Thermostat());
		
	}


	public void turnOnLight() {
		LightBulb lightBulb = (LightBulb) this.getActuator("lightBulb");
		lightBulb.turnOn();
		
	}

	public void turnOffLight() {
		LightBulb lightBulb = (LightBulb) this.getActuator("lightBulb");
		lightBulb.turnOff();
	}

	public void lockDoor() {
		DoorLock doorLock = (DoorLock) this.getActuator("doorLock");
		doorLock.lockDoor();
		
	}

	public void unlockDoor() {
		DoorLock doorLock = (DoorLock) this.getActuator("doorLock");
		doorLock.unlockDoor();
		
	}

	public void setTemperature(int temperature) {
		Thermostat thermostat = (Thermostat) this.getActuator("thermostat");
		thermostat.setTemperature(temperature);
		
	}
	
	private Sensor getSensor(String sensorName) {
        return sensors.get(sensorName);
    }
	private Actuator getActuator(String actuatorName) {
        return actuators.get(actuatorName);
    }
}


