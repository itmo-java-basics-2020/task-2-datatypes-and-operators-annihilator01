package ru.itmo.java;

import jdk.swing.interop.SwingInterOpUtils;

import java.awt.desktop.SystemSleepEvent;
import java.sql.SQLOutput;

@SuppressWarnings("all")
public class Task2 {

    /**
     * Дано произвольное вещественное число. Выведите его дробную часть
     * <p>
     * Например
     * - дано 17.9
     * -
     *
     *
     *
     * вывод 0.9
     */
    double getFractionalPart(double realNumber) {
        return realNumber - Math.floor(realNumber);
    }

    /**
     * Дан символ, верните его код. Не используйте явное приведение типов и любые библиотечные функции
     */
    int charCode(char c) {
        return c;
    }

    /**
     * Даны 2 целых числа. Проверьте равны ли они
     */
    boolean testIfIntsEqual(Integer a, Integer b) {
        return a.equals(b);
    }

    /**
     * Дано целое число. Выведите {@code true}, если оно входит в заданный диапазон или {@code false}
     * в иных случаях
     *
     * @param number      заданное число
     * @param leftBound   правая граница диапазона
     * @param rightBound  верхняя граница диапазона
     * @param inclusively входят ли границы в заданный даипазон
     */
    boolean numberInRange(Integer number, Integer leftBound, Integer rightBound, Boolean inclusively) {
        if (number == null ||
            leftBound == null ||
            rightBound == null ||
            inclusively == null) {
            return false;
        }

        int inclusivelyInt = (inclusively) ? 1 : 0;

        return (long)(rightBound + inclusivelyInt) > number && number > (long)(leftBound - inclusivelyInt);
    }

    /**
     * Даны 3 символа. Определите является ли хотя бы один из них цифрой 1..9
     */
    boolean atLeastOneIsDigit(char c1, char c2, char c3) {
        boolean isC1Digit = (int)c1 >= (int)'0' && (int)c1 <= (int)'9';
        boolean isC2Digit = (int)c2 >= (int)'0' && (int)c2 <= (int)'9';
        boolean isC3Digit = (int)c3 >= (int)'0' && (int)c3 <= (int)'9';

        return isC1Digit || isC2Digit || isC3Digit;
    }

    /**
     * Даны два вещественных числа. Определите равны ли они
     */
    boolean areRealNumbersEqual(double a, double b) {
        double delta = 1e-9;
        return (Math.abs(a - b) < delta) ? true : false;

    }

    /**
     * Дано трехзначное число 100 <= N <= 999. Найдите сумму его чисел.
     */
    int sumOfDigits(int n) {
        int firstDigit = n / 100;
        int secondDigit = (n % 100) / 10;
        int thirdDigit = (n % 100) % 10;

        return firstDigit + secondDigit + thirdDigit;
    }

    /**
     * Дано натуральное число N <= 10000. Выведите следующее после N четное число. Например: N = 8, Result = 10
     */
    int nextEvenNumber(int n) {
        return n + 2 - n % 2;
    }

    /**
     * Школа №32 решила создать 3 дополнительных физмат класса и укомплектовать кабинеты новыми партами.
     * За одной партой может сидеть 2 ученика. Кол-во учеников в каждом из классов известно (num1, num2, num3).
     * Выведите минимальное кол-во парт, которые нужно приобрести школе, при условии что каждый из классов сидит в
     * своем кабинете
     */
    int schoolDesks(int num1, int num2, int num3) {
        return num1 / 2 + num2 / 2 + num3 / 2 + num1 % 2 + num2 % 2 + num3 % 2;
    }

    /**
     * Дано натуральное число N >= 10. Выведите результат применения XOR к последним 2-м цифрам числа N
     */
    int xorDigits(int N) {
        int preLastDigit = (N / 10) % 10;
        int LastDigit = N % 10;

        return preLastDigit ^ LastDigit;
    }

}
