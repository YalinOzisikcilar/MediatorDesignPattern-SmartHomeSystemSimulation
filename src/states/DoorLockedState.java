package states;

import smartHomeSystem.DoorLock;

public class DoorLockedState implements DoorState{

	public DoorLockedState() {

	}

	@Override
	public void lockDoor(DoorLock doorLock) {
		
		
	}

	@Override
	public void unlockDoor(DoorLock doorLock) {
		doorLock.setState(new DoorUnlockedState());
		
	}

	@Override
	public String getDoorStateDescription() {

		return "The door is locked.";
	}

}
