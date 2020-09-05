package oppg2;

public class ProducerConsumer {

  public static void main(String[] args) {
	  Burger b = new Burger();
	  
	  Producer k1 = new Producer(b, 1);
	  Producer k2 = new Producer(b, 2);
	  Producer k3 = new Producer(b, 3);
	
	  
	  Consumer c1 = new Consumer(b, 1);
	  Consumer c2 = new Consumer(b, 2);
	  
	  
	  
	  k1.start();
	  k2.start();
	  k3.start();
	
	  c1.start();
	  c2.start();
	 
	  
  }
}
