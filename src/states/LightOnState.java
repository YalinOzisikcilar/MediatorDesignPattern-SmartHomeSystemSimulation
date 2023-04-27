package states;

import smartHomeSystem.LightBulb;

public class LightOnState implements LightState {


	@Override
	public void turnOnLight(LightBulb lightBulb) {
		// Do nothing, already in the on state
		
	}

	@Override
	public void turnOffLight(LightBulb lightBulb) {
		lightBulb.setState(new LightOffState());
		
	}

	public LightOnState() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getLightStateDescription() {
		// TODO Auto-generated method stub
		return "The light is on.";
	}

}
