package ru.gb.rybalchenko;

/**
 * Декоратор. Он декорирует, то есть, накладывает на результат декорации.
 * Внешний вид важен, поэтому этот класс существует.
 */

public class Decorator {
    /**
     * Функция декорирования числа для вывода в консоль в виде строки с преамбулой 'Вот ваше число'
     *
     * @param a число, требующее декорации
     * @return Отформатированная строка.
     */
    public static String decorate(int a){
        /**
         * Метод декорирует число, добавляя к нему строку
         * при помощи функции форматирования строк
         */
        return String.format("Вот ваше число: %d.", a);
    }
}
