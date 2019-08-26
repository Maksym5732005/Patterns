package java_patterns.simple_factory;

public class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing a cheese pizza...");
    }

    @Override
    public void bake() {
        System.out.println("Baking a pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting...");
    }

    @Override
    public void box() {
        System.out.println("Boxing in official box");
    }
}
