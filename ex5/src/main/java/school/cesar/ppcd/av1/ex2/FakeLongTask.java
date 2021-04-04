package school.cesar.ppcd.av1.ex2;

import static school.cesar.ppcd.av1.ex2.Util.nap;

public class FakeLongTask implements Runnable {
	private boolean done = false;
	private static final long ONE_MINUTE = 60 * 200;

	public void run() {
		synchronized (this) {
			if (!isDone()) {
				System.out.println("Not done yet!");
				nap(ONE_MINUTE);
				done = true;
			} else {
				System.out.println("Is done!");
			}
		}
	}

	public boolean isDone() {
		return done;
	}
}
