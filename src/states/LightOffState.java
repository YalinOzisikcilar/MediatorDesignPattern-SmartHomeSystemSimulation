package states;

import smartHomeSystem.LightBulb;

public class LightOffState implements LightState {

	public LightOffState() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void turnOnLight(LightBulb lightBulb) {
		lightBulb.setState(new LightOnState());
		
	}

	@Override
	public void turnOffLight(LightBulb lightBulb) {
		// Do nothing, already in the off state
		
	}


	@Override
	public String getLightStateDescription() {
		// TODO Auto-generated method stub
		return "The light is off.";
	}

}
