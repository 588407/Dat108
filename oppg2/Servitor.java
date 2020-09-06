package oppg2;

public class Servitor extends Thread {

    private final int number;
    private final Rutsjebane rutsjebane;

    public Servitor(Rutsjebane rutsjebane, int number) {
        this.rutsjebane = rutsjebane;
        this.number = number;
    }

    public void run() {
        int value = 0;

        for (int i = 0; i < 1000; i++) {
            try {
                sleep((long) (Math.random() * 2000) + 4000);


            } catch (InterruptedException e) {

            }
//            value = burger.get();
//            System.out.println("Servitør #" + this.number + " tok burger nr:" + value);
            rutsjebane.taAvBurger(this);
        }
    }

    @Override
    public String toString() {
        return "Servitør" + number;
    }
}