package states;

import smartHomeSystem.Thermostat;

public interface ThermostatState {
	void increaseTemperature(Thermostat thermostat);
	void decreaseTemperature(Thermostat thermostat);
	void closeThermostat(Thermostat thermostat);
	String getThermostatStateDescription();
	
}
