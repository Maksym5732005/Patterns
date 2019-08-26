package java_patterns.factory.ex.two.factory;


import java_patterns.factory.ex.two.model.cpu.CPU;
import java_patterns.factory.ex.two.model.cpu.EmberCPU;
import java_patterns.factory.ex.two.model.mmu.EmberMMU;
import java_patterns.factory.ex.two.model.mmu.MMU;

/**
 * ConcreteFactory
 */
public class EmberToolkit implements ArchitectureToolkitIF {

    @Override
    public CPU createCPU() {
        return new EmberCPU();
    }

    @Override
    public MMU createMMU() {
        return new EmberMMU();
    }
}
