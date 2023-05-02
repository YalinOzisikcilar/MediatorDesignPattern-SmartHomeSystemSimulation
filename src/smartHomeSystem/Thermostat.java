package smartHomeSystem;

import states.ThermostatClosedState;
import states.ThermostatState;

public class Thermostat extends Actuator{
	
	private int currentTemperature;
	private ThermostatState state;
	
	public Thermostat() {
		this.state = new ThermostatClosedState();  //initial state is closed.
	}
	public void decreaseTemperature(int currentTemperature) {
		this.currentTemperature = currentTemperature;
		state.decreaseTemperature(this);
		this.fixTemperature();
	}

	public void increaseTemperature(int currentTemperature) {
		this.currentTemperature = currentTemperature;
		state.increaseTemperature(this);
		this.fixTemperature();
	}
	
	public void closeThermostat(int currentTemperature) {
		this.currentTemperature = currentTemperature;
		state.closeThermostat(this);
		this.fixTemperature();
		
	}
	
	public void fixTemperature() {
		state.fixTemperature(this);
	}

	public String getStateDescription() {
		
		return state.getThermostatStateDescription(currentTemperature);
	}
	public void setState(ThermostatState thermostatState) {
		
		this.state = thermostatState;
	}
	public void setTemperature(int newTemperature) {
		
		currentTemperature = newTemperature;
		
	}
	public int getTemperature() {

		return currentTemperature;
	}
	

}
