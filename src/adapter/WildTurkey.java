package adapter;

/**
 * Adaptee
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gooble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
