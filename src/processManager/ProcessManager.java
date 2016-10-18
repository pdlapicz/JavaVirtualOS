/*
 * Autor Jakub Rybakowski
 * Stworzony 13:15 18.10.2016
 */

package processManager;

public class ProcessManager {

	private Process mainProcess;
	
	public ProcessManager() {
		mainProcess = new Process("main", 0, 1);
	}

	public void newProcess(String name, int priority) {
		mainProcess.addProcess(name, priority);
	}
	
	public void shutDown() {
		mainProcess.kill();
	}
	
	public void ps() {
		System.out.println("PID\tPPID\tNAME\tSTATE\tPRIORITY");
		mainProcess.print();
	}
}
