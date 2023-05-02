package states;

import smartHomeSystem.Thermostat;

public class ThermostatClosedState implements ThermostatState{

	public ThermostatClosedState() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void increaseTemperature(Thermostat thermostat) {

		thermostat.setState(new ThermostatHeatingState());
		
	}

	@Override
	public void decreaseTemperature(Thermostat thermostat) {
		
		thermostat.setState(new ThermostatCoolingState());
	}
	
	@Override
	public void closeThermostat(Thermostat thermostat) {
		// Do nothing it is already closed.
		
	}

	@Override
	public String getThermostatStateDescription(int currentTemperature) {

		return "Thermostat is closed." + " Temperature measured as: " 
				+ currentTemperature + " Current temperature: " + currentTemperature;
	}

	@Override
	public void fixTemperature(Thermostat thermostat) {
		// do nothing thermostat is closed.
		
	}

	

}
