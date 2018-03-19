package factory.ex.two.model.cpu;

/**
 * ConcreteProduct
 */
public class GloryCPU implements CPU {
    private final String mInfo = "Glory";

    @Override
    public void showInfo() {
        System.out.println("CPU type: " + mInfo);
    }
}
