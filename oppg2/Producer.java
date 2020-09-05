package oppg2;

public class Producer extends Thread{

  private Burger burger;
  private int number;
  
  		public Producer(Burger b, int number) {
  			burger = b;
  			this.number = number;
  			
  		}
  		
  		public void run() {
  			for(int i = 0; i < 1000; i++) {
  				try {
  	  				sleep((long) (Math.random() *2000));
  	  				
  	  				
  	  			} catch (InterruptedException e) {
  	  				
  	  			}
  				burger.set(i);
  				System.out.println("Kokk #" + this.number + " setter burger på rutjebane #" +i);
  			}
  		}
  		}
