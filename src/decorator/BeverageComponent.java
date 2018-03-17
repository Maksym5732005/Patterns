package decorator;

/**
 * Представляет компонет, реализующий общую модель поведения.
 * Может быть как абстрактным классом, так и интерфейсом.
  */
public abstract class BeverageComponent {
    protected String description = "Unknown Beverage";
    public String getDescription(){ // для описания напитка
        return description;
    }
    public abstract double cost(); // для цены за напиток
}
