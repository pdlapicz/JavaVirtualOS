/*
 * Autor Jakub Rybakowski
 * Stworzony 13:26 18.10.2016
 */

package processManager;

import java.util.HashMap;
import java.util.Map.Entry;
public class Process {

	private static int CPID = 0;
	private int PID; // identyfikator procesy
	private String name; // nazwa
	private int PPID; // proces nadrzêdny
	private int priority; // priorytet
	private String state;

	private HashMap<Integer, Process> KPID = new HashMap<Integer, Process>(); // proces potomne
	
	public Process(String name, int PPID, int priority) {
		this.name = name;
		this.PPID = PPID;
		this.priority = priority;
		this.PID = CPID++;
		this.state = "NEW";
	}
	
	public void addProcess(String name, int priority) {
		Process process = new Process(name, PID, priority);
		KPID.put(CPID, process);
	}
	
	public String getName() {
		return name;
	}

	public void print() {
		System.out.println(PID+"\t"+PPID+"\t"+name+"\t"+state+"\t"+priority);
		for (Entry<Integer, Process> entry : KPID.entrySet()) {
			entry.getValue().print();
		}
	}
	
	public void kill() {
		state = "KILL";
		for (Entry<Integer, Process> entry : KPID.entrySet()) {
			entry.getValue().kill();
		}
	}
}
 