package java_patterns.adapter;

/**
 * Client
 */
public class MainOfAdapter {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        // use same commands for all
        System.out.println("Duck...");
        duck.quack();
        duck.fly();

        System.out.println("\nTurkey...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
