package factory.ex.two.factory;

import factory.ex.two.model.cpu.CPU;
import factory.ex.two.model.mmu.MMU;

/**
 * AbstractFactory / Factory / Toolkit (main interface)
 */
public interface ArchitectureToolkitIF {
    CPU createCPU();

    MMU createMMU();
}
