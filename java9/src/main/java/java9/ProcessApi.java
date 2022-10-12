package java9;

public class ProcessApi {

	public static void main(String[] args) {
		ProcessHandle current = ProcessHandle.current();
		System.out.println("PID : " + current.pid() + ", PPID : "
				+ current.parent().get().pid());
	}
}
