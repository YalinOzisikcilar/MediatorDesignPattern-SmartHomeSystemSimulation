package smartHomeSystem;


import states.DoorLockedState;
import states.DoorState;


public class DoorLock extends Actuator{
	private DoorState state;

	public DoorLock() {
		this.state= new DoorLockedState();
	}

	 public void setState(DoorState state) {
	        this.state = state;
	    }
	    
	    public void lockDoor() {
	        state.lockDoor(this);;
	    }
	    
	    public void unlockDoor() {
	        state.unlockDoor(this);;
	    }

		public String getStateDescription() {
			// TODO Auto-generated method stub
			return state.getDoorStateDescription();
		}
}
