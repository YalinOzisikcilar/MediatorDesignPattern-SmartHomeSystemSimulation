package states;

import smartHomeSystem.LightBulb;

public interface LightState {
	void turnOnLight(LightBulb lightBulb);
	void turnOffLight(LightBulb lightBulb);

	String getLightStateDescription();

}
