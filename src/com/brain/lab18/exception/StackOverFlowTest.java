package com.brain.lab18.exception;

public class StackOverFlowTest {
    static int count;

    static void test() {
        System.out.println(count++);
        test();
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (StackOverflowError e) {
            System.out.println("Ошибка Рекурсия");
        }
    }
}
