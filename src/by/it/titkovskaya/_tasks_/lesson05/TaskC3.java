package by.it.titkovskaya._tasks_.lesson05;

/* Задачка на сортировку2
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n log n)
*/

import java.util.Scanner;

public class TaskC3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] array= new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int low = 0;
        int high = array.length - 1;
        quicksort(array, low, high);

        for (Integer x: array) {
            System.out.println(x);
        }
    }

    public static void quicksort(int[] array, int low, int high) {
        if (array.length == 0) return;
        if (low >= high) return;

        int middle = low + (high - low) / 2;
        int opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] > opora) {
                i++;
            }
            while (array[j] < opora) {
                j--;
            }
            if (i <= j) {
                int buf = array[i];
                array[i] = array[j];
                array[j] = buf;
                i++;
                j--;
            }
        }
        if (low < j) quicksort(array, low, j);
        if (high > i) quicksort(array, i, high);
    }
}