package java_patterns.factory.ex.two;

import java_patterns.factory.ex.two.factory.ArchitectureToolkitIF;
import java_patterns.factory.ex.two.factory.EmberToolkit;
import java_patterns.factory.ex.two.factory.EnginolaToolkit;
import java_patterns.factory.ex.two.factory.GloryToolkit;

/**
 * Singleton
 * Factory Method that works with Factories instead of Products.
 * Helps choose what java_patterns.factory will be use.
 */
public class ToolkitFactory {

    public static final int EMBER = 900;
    public static final int ENGINOLA = 907;
    public static final int GLORY = 915;

    private static ToolkitFactory mToolkitFactory = new ToolkitFactory();

    public static ToolkitFactory get() {
        return mToolkitFactory;
    }

    public ArchitectureToolkitIF createToolkit(final int architecture) {
        switch (architecture) {
            case EMBER:
                return new EmberToolkit();

            case ENGINOLA:
                return new EnginolaToolkit();

            case GLORY:
                return new GloryToolkit();

            default:
                String arch = Integer.toString(architecture);
                String msg = "unknown arch type=" + arch;
                throw new IllegalArgumentException(msg);
        }
    }
}
