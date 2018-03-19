package factory.ex.two;

import factory.ex.two.factory.ArchitectureToolkitIF;
import factory.ex.two.model.cpu.CPU;
import factory.ex.two.model.mmu.MMU;

/**
 * Client
 */
public class Client {
    public void doIt() {
        ArchitectureToolkitIF af; // <- abstract factory I
        ToolkitFactory factory = ToolkitFactory.get();

        // factory initialization
        af = factory.createToolkit(ToolkitFactory.EMBER);
        // Use factory in client
        CPU cpu = af.createCPU();
        MMU mmu = af.createMMU();
        cpu.showInfo();
    }
}
