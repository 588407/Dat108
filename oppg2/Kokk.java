package oppg2;

public class Kokk extends Thread {

    private int number;

    private final Rutsjebane rutsjebane;

    public Kokk(Rutsjebane rutsjebane, int number) {
        this.rutsjebane = rutsjebane;
        this.number = number;

    }

	public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                sleep((long) (Math.random() * 2000) + 4000);

            } catch (InterruptedException e) {

            }
            rutsjebane.leggPaaBurger(this, new Burger());
        }
    }

	@Override
	public String toString() {
		return "Kokk" + number;
	}
}
