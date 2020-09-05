package oppg2;

public class Burger {
	
	private int contents;
	private boolean available = false;
	
	synchronized public int get() {
		while (!available) {
			try {
				wait();
				
			} catch (InterruptedException e) {
				
			}
		}
		available = false;
		notifyAll();
		
		return contents;
	}
	
	synchronized public void set(int value) {
		while (available) {
			try {
				wait();
			} catch (InterruptedException e) {
				
			}
		}
		available = true;
		contents = value;
		notifyAll();
	}
	
	
	
	
	
	
}