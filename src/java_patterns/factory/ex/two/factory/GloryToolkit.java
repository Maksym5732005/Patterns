package java_patterns.factory.ex.two.factory;

import java_patterns.factory.ex.two.model.cpu.CPU;
import java_patterns.factory.ex.two.model.cpu.GloryCPU;
import java_patterns.factory.ex.two.model.mmu.GloryMMU;
import java_patterns.factory.ex.two.model.mmu.MMU;

/**
 * ConcreteFactory
 */
public class GloryToolkit implements ArchitectureToolkitIF {
    @Override
    public CPU createCPU() {
        return new GloryCPU();
    }

    @Override
    public MMU createMMU() {
        return new GloryMMU();
    }
}
