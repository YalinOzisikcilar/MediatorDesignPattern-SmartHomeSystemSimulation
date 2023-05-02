package smartHomeSystem;

import states.LightOffState;
import states.LightState;

public class LightBulb extends Actuator{
private LightState state;
    
    public LightBulb() {
        state = new LightOffState();
    }
    
    public void setState(LightState state) {
        this.state = state;
    }
    
    public void turnOn() {
        state.turnOnLight(this);
    }
    
    public void turnOff() {
        state.turnOffLight(this);
    }

	public String getStateDescription() {
		// TODO Auto-generated method stub
		return state.getLightStateDescription();
	}


}
