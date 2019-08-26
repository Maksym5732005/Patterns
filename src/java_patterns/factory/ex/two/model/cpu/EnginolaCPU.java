package java_patterns.factory.ex.two.model.cpu;

/**
 * ConcreteProduct
 */
public class EnginolaCPU implements CPU {
    private final String mInfo = "Enginola";

    @Override
    public void showInfo() {
        System.out.println("CPU type: " + mInfo);
    }
}
