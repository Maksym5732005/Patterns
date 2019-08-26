package java_patterns.decorator.decorators;

import java_patterns.decorator.BeverageComponent;

/**
 * Абстрактный класс или интерфейс, который определяет стандартное
 * поведение, общее для всех экземпляров ConcreteDecorator. Этот
 * класс обеспечивает поддержку хранения информации: в нём
 * содержится ссылка на BeverageComponent, который может быть представлен
 * как классом HouseBlend, так и классом ConcreteDecorator.
 * Если иерархия классов CondimentDecorator создаётся в виде подклассов тех
 * классов, которые они расширяют, эта ссылка может импользоваться для
 * каких-то других целей.
 */
public abstract class CondimentDecorator extends BeverageComponent {
    public abstract String getDescription();
}
