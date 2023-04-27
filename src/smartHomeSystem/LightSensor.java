package smartHomeSystem;

import java.util.Random;



public class LightSensor extends Sensor {

	@Override
	public Signal readSensor() {
		Random random = new Random();
		Signal signal = Signal.NEUTRAL;
		int randomInt = random.nextInt(3);
	    if( randomInt == 0) {
	    	signal = Signal.HIGH;
	    }
	    else if (randomInt == 1){
	    	signal = Signal.LOW;
	    }
	    return signal;
	}
	public LightSensor() { 
		
	}

}
