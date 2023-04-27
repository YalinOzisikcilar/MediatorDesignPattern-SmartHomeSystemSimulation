package states;

import smartHomeSystem.DoorLock;

public interface DoorState {
	void lockDoor(DoorLock doorLock);
	void unlockDoor(DoorLock doorLock);
	String getDoorStateDescription();
}
