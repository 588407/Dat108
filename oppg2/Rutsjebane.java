package oppg2;

import java.util.ArrayDeque;
import java.util.Queue;

public class Rutsjebane {

    private final Queue<Burger> burgere = new ArrayDeque<>();

    public void leggPaaBurger(Kokk kokk, Burger burger) {
        System.out.printf("%s legger på burger%s => %s\n", kokk, burger, burgere);
        burgere.add(burger);
    }

    public void taAvBurger(Servitor servitor) {
        if (!burgere.isEmpty()) {
            Burger burger = burgere.remove();
            System.out.printf("%s tar av burgere%s <= %s\n", servitor, burger, burgere);
        }
    }
}
