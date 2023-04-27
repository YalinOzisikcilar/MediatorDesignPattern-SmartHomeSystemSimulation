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
	public String getThermostatStateDescription() {

		return "Thermostat is closed.";
	}

	

}
