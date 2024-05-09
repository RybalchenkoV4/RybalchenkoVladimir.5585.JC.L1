package ru.gb.rybalchenko;

/**
 * Оснровной класс приложения. Здесь мы можем писать его основное назначение и
 * способы взаимодействия с ним.
 */

public class Main {
    /**
     * точка входа в программу. С нее всегда все начинается.
     * @param args стандартные аргументы командной строки
     */
    public static void main(String[] args) {
        int result = OtherClass.add(2,2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.sub(2,2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.mul(2,2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(2,2);
        System.out.println(Decorator.decorate(result));
    }
}
