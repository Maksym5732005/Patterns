package java_patterns.factory.ex.two;

import java_patterns.factory.ex.two.factory.ArchitectureToolkitIF;
import java_patterns.factory.ex.two.model.cpu.CPU;
import java_patterns.factory.ex.two.model.mmu.MMU;

/**
 * Client
 */
public class Client {
    public void doIt() {
        ArchitectureToolkitIF af; // <- abstract java_patterns.factory I
        ToolkitFactory factory = ToolkitFactory.get();

        // java_patterns.factory initialization
        af = factory.createToolkit(ToolkitFactory.EMBER);
        // Use java_patterns.factory in client
        CPU cpu = af.createCPU();
        MMU mmu = af.createMMU();
        cpu.showInfo();
    }
}
