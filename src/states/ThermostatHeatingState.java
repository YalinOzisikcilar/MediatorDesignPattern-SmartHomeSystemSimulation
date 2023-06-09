package states;

import smartHomeSystem.Thermostat;

public class ThermostatHeatingState  implements ThermostatState{

	public ThermostatHeatingState() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void increaseTemperature(Thermostat thermostat) {
		
		// already heating
	}

	@Override
	public void decreaseTemperature(Thermostat thermostat) {
		
		thermostat.setState(new ThermostatCoolingState());
		
	}
	
	@Override
	public void closeThermostat(Thermostat thermostat) {
		
		thermostat.setState(new ThermostatClosedState());
		
	}

	@Override
	public String getThermostatStateDescription(int currentTemperature) {
		// TODO Auto-generated method stub
		return "Thermostat is heating." + " Temperature measured as: " 
				+ (currentTemperature -1) + " Current temperature: " + currentTemperature;
	}

	@Override
	public void fixTemperature(Thermostat thermostat) { //increase the temperature by 1.
		thermostat.setTemperature(thermostat.getTemperature() + 1);
	}

}
