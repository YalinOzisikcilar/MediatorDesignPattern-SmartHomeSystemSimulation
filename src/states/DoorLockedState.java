package states;

import smartHomeSystem.DoorLock;

public class DoorLockedState implements DoorState{

	public DoorLockedState() {
		// TODO Auto-generated constructor stub
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
		// TODO Auto-generated method stub
		return "The door is locked.";
	}

}
