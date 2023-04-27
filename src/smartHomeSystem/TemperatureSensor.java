package smartHomeSystem;

import java.util.Random;

public class TemperatureSensor extends Sensor {

	public TemperatureSensor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Signal readSensor() {
		Random random = new Random();
		Signal signal = Signal.NEUTRAL;
		int randomTemperature = random.nextInt(40);
	    if( randomTemperature > 25) {
	    	signal = Signal.HIGH;
	    }
	    else if (randomTemperature < 20){
	    	signal = Signal.LOW;
	    }
	    return signal;
	}
}
