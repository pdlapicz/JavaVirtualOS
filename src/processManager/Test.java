package processManager;

public class Test {

	public static void main(String[] args) {
		ProcessManager processManager = new ProcessManager();
		processManager.newProcess("a1", 1);
		processManager.newProcess("a2", 1);
		processManager.newProcess("a3", 1);
		processManager.newProcess("a4", 1);
		processManager.ps();
		processManager.shutDown();
		processManager.ps();
	}
}
