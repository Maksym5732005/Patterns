package java_patterns.factory.ex.two.factory;

import java_patterns.factory.ex.two.model.cpu.CPU;
import java_patterns.factory.ex.two.model.mmu.MMU;

/**
 * AbstractFactory / Factory / Toolkit (main interface)
 */
public interface ArchitectureToolkitIF {
    CPU createCPU();

    MMU createMMU();
}
