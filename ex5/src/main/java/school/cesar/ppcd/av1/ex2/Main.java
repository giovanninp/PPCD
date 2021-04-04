package school.cesar.ppcd.av1.ex2;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		FakeLongTask fakeLongTask = new FakeLongTask();
		Thread threadFakeLongTask = new Thread(fakeLongTask);
		Thread threadFakeConsumer = new Thread(fakeLongTask);
		
		threadFakeLongTask.start();
		threadFakeConsumer.start();
	}
}
