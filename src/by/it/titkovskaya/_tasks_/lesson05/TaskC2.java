package by.it.titkovskaya._tasks_.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n*n).
*/

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] array= new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        sort(array);
        for (Integer x: array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                int buf = array[j];
                array[j] = array[i];
                array[i] = buf;
                }
            }
        }
    }
}
