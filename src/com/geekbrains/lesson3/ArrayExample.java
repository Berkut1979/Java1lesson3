package com.geekbrains.lesson3;

   /* №1 - Задать целочисленный массив, состоящий из элементов 0 и 1.
Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]
С помощью цикла и условия заменить 0 на 1, 1 на 0;
   */

import java.util.Arrays; //Не понял почему эта запись стала серой!!!!

public class ArrayExample {

    public static void main(String[] args) {
        arrayExample();
        fillArray();
        changeArray();
        fillDiagonal();
        minmaxArray();
        }

    public static void arrayExample() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) array[i] = 0;
            else array[i] = 1;
            System.out.print(array[i] + " ");
        }
    }

    /* №2 - Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
значениями 1 2 3 4 5 6 7 8 … 100;
 */
    public static void fillArray() {
        int[] arr = new int[100];
        int i;
        for (i = 0; i < 100; i ++) {
           System.out.println("Значение [" + i + "] : " + arr[i]);
        }
    }

    /* №3 - Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
умножить на 2;
     */
    public static void changeArray() {
        int[] arr1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < 6) {
                System.out.println(arr1[i] * 2);
            }
        }
    }

    /* №4 - Создать квадратный двумерный целочисленный массив (количество строк и столбцов
            одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
            (можно только одну из диагоналей, если обе сложно). Определить элементы одной из
    диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0],
            [1][1], [2][2], …, [n][n];
      */
    public static void fillDiagonal() {
        int[][] arr2 = new int[4][4];
        arr2 [0] = new int[]{1, 2, 3, 1};
        arr2 [1] = new int[]{4, 1, 1, 5};
        arr2 [2] = new int[]{6, 1, 1, 7};
        arr2 [3] = new int[]{1, 8, 9, 1};
            for (int i = 0; i < arr2.length; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }
    }

    // * №5 - *Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    public static void minmaxArray() {
        int [] arr3 = new int[10];
        int min, max;
        arr3 [0] = 77;
        arr3 [1] = 188;
        arr3 [2] = 343;
        arr3 [3] = 2;
        arr3 [4] = 18;
        arr3 [5] = -515;
        arr3 [6] = 88;
        arr3 [7] = 43;
        arr3 [8] = -22;
        arr3 [9] = 1;
        min = max = arr3 [0];
        for (int i1 = 1; i1 < 10; i1++)
        {
            if (arr3[i1] < min) min = arr3[i1];
            if (arr3[i1] > max) max = arr3[i1];
        }
        System.out.println("min: " + min + " ");
        System.out.println("max: " + max + " ");
    }
    /* №6** - Написать метод, в который передается не пустой одномерный целочисленный массив,
     метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части
     массива равны.
     Примеры:
checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
     */


}