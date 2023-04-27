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

	}

	@Override
	public String getLightStateDescription() {

		return "The light is on.";
	}

}
