package factory.ex.two.factory;


import factory.ex.two.model.cpu.CPU;
import factory.ex.two.model.mmu.EmberMMU;
import factory.ex.two.model.mmu.MMU;
import factory.ex.two.model.cpu.EmberCPU;

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
