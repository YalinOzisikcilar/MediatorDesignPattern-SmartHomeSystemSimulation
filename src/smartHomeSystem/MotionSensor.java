package smartHomeSystem;

import java.util.Random;

public class MotionSensor extends Sensor {

	public MotionSensor() {
		// TODO Auto-generated constructor stub
	}
	
	public Signal readSensor() {
		Random random = new Random();
		Signal signal = Signal.LOW;
		int randomInt = random.nextInt(2);
	    if( randomInt == 0) {
	    	signal = Signal.HIGH;
	    }
	    return signal;
	}

}
