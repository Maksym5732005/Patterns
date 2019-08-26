package java_patterns.factory.ex.two.factory;


import java_patterns.factory.ex.two.model.cpu.CPU;
import java_patterns.factory.ex.two.model.cpu.EnginolaCPU;
import java_patterns.factory.ex.two.model.mmu.EnginolaMMU;
import java_patterns.factory.ex.two.model.mmu.MMU;

/**
 * ConcreteFactory
 */
public class EnginolaToolkit implements ArchitectureToolkitIF {
    @Override
    public CPU createCPU() {
        return new EnginolaCPU();
    }

    @Override
    public MMU createMMU() {
        return new EnginolaMMU();
    }
}
