package smartHomeSystem;

import java.util.HashMap;

import controlPanel.IControlPanel;

public class SmartHomeSystem {
	private HashMap<String, Sensor> sensors;
	private HashMap<String, Actuator> actuators;
	private IControlPanel controlPanel;

	public SmartHomeSystem(IControlPanel controlPanel) {
		this.controlPanel = controlPanel;
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
		Signal temperatureSignal = readTempSensor();
		Thermostat thermostat = (Thermostat) actuators.get("thermostat");
		if(temperatureSignal == Signal.HIGH) {
			thermostat.decreaseTemperature();
		}
		else if(temperatureSignal == Signal.LOW) {
			thermostat.icreaseTemperature();
		}
		else {
			thermostat.closeThermostat();
		}
	}
	
	private Signal readTempSensor() {
		Signal signal = this.getSensor("temperatureSensor").readSensor();
		return signal;
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
	private Sensor getSensor(String sensorName) {
        return sensors.get(sensorName);
    }
	private Actuator getActuator(String actuatorName) {
        return actuators.get(actuatorName);
    }
}


