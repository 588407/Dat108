package oppg2;

public class Consumer extends Thread{

  private Burger burger;
  private int number;
  
  	public Consumer(Burger b, int number) {
  		burger = b;
  		this.number = number;
  	}
  	public void run() {
  		int value = 0;
  		
  		for (int i = 0; i < 1000; i++) {
  			try {
  				sleep((long) (Math.random() *2000));
  				
  				
  			} catch (InterruptedException e) {
  				
  			}
  			value = burger.get();
  			System.out.println("Servitør #" + this.number + " tok burger nr:" + value);
  		}
  	}
}