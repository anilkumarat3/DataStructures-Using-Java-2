class Mythread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread is Running:");
		     try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class excepti {

	public static void main(String args[]) {
		System.out.println("Inside Main Thread:");
		Mythread t = new Mythread();
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread Running");
		}
	}

}
