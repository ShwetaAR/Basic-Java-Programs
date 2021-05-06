package programs;

public class SynchTestWisen {

	private String name;

	public SynchTestWisen(String name) {
		this.name = name;
	}

	public synchronized void synchMethof() {
		System.out.println(name + "M1");
		System.out.println(name + "M2");

	}

	public static void main(String[] args) throws InterruptedException {
		SynchTestWisen obj = new SynchTestWisen("o1");
		SynchTestWisen obj_2 = new SynchTestWisen("o2");

		Thread t1 = new Thread() {
			public void run() {
				obj.synchMethof();
			};
		};
		Thread t2 = new Thread() {
			public void run() {
				obj_2.synchMethof();
			};
		};

		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}

}
