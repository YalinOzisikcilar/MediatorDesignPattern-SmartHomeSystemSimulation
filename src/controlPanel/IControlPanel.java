package controlPanel;

public interface IControlPanel {
	void turnOnLight();
	void turnOffLight();
	void lockDoor();
	void unlockDoor();
	void setTemperature(int temperature);
}
