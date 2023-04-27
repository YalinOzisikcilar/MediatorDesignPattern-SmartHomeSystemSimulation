package states;

import smartHomeSystem.Thermostat;

public class ThermostatCoolingState implements ThermostatState{

	public ThermostatCoolingState() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void increaseTemperature(Thermostat thermostat) {

		thermostat.setState(new ThermostatHeatingState());
		
	}

	@Override
	public void decreaseTemperature(Thermostat thermostat) {

		
	}
	
	@Override
	public void closeThermostat(Thermostat thermostat) {
		
		thermostat.setState(new ThermostatClosedState());
		
	}

	@Override
	public String getThermostatStateDescription() {
		// TODO Auto-generated method stub
		return "Thermostat is closed.";
	}

	@Override
	public void fixTemperature(Thermostat thermostat) { //decrease the temperature by 1.
		thermostat.setTemperature(thermostat.getTemperature() - 1);
		
	}

	

}
