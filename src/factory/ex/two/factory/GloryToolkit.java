package factory.ex.two.factory;

import factory.ex.two.model.cpu.CPU;
import factory.ex.two.model.cpu.GloryCPU;
import factory.ex.two.model.mmu.GloryMMU;
import factory.ex.two.model.mmu.MMU;

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
