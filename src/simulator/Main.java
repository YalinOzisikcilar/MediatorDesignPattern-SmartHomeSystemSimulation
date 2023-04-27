package simulator;
import controlPanel.ControlPanel;
import controlPanel.IControlPanel;

public class Main {


	public static void main(String[] args) {
		IControlPanel controlPanel = new ControlPanel();
		Simulation simulation = new Simulation(controlPanel);
		simulation.runSimulation();
	}

}
