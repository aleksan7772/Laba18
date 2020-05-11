package com.brain.lab18.exception;


import java.util.Arrays;

public class ArrayExceptionTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{1,2,3,4,8,4};
        printArray(arr2);
        System.out.println();
        printArray(arr);
    }

    static void printArray(int[] mains) {
        int main = 0;
        try {
           for (main = 6; main > mains.length; main++) {
                int i = mains[main];
           }
            System.out.print(Arrays.toString(mains));
        } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("«Ошибка. Попытка обращения к несуществующему индексу: текущий индекс = " + main + " размер массива = " + mains.length);
       }

    }
}