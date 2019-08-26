package java_patterns.factory.ex.two.model.cpu;

/**
 * ConcreteProduct
 */
public class EmberCPU implements CPU {
    private final String mInfo = "Ember";

    @Override
    public void showInfo() {
        System.out.println("CPU type: " + mInfo);
    }
}
