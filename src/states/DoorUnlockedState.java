package states;

import smartHomeSystem.DoorLock;

public class DoorUnlockedState implements DoorState{

	public DoorUnlockedState() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void lockDoor(DoorLock doorLock) {
	
		doorLock.setState(new DoorLockedState());
		
	}

	@Override
	public void unlockDoor(DoorLock doorLock) {

		
	}

	@Override
	public String getDoorStateDescription() {
		// TODO Auto-generated method stub
		return "The door is unlocked.";
	}

}
