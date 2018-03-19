package factory.ex.two.factory;


import factory.ex.two.model.cpu.CPU;
import factory.ex.two.model.mmu.EnginolaMMU;
import factory.ex.two.model.mmu.MMU;
import factory.ex.two.model.cpu.EnginolaCPU;

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
