package smartHomeSystem;

import states.ThermostatClosedState;
import states.ThermostatHeatingState;
import states.ThermostatState;

public class Thermostat extends Actuator{
	
	private int temperature;
	private ThermostatState state;
	
	public Thermostat() {
		this.state = new ThermostatClosedState();  //initial state is closed.
	}
	public void decreaseTemperature() {
		
		
	}

	public void icreaseTemperature() {
		// TODO Auto-generated method stub
		
	}
	
	public void closeThermostat() {
		// TODO Auto-generated method stub
		
	}

	public String getStateDescription() {
		
		return state.getThermostatStateDescription();
	}
	public void setState(ThermostatState thermostatState) {
		
		this.state = thermostatState;
	}
	

}
