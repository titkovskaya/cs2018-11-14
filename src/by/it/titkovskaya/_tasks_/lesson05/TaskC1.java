package by.it.titkovskaya._tasks_.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int[] m = new int[20];
        for (int i = 0; i < m.length; i++) {
            m[i]=scanner.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < m.length; i++) list.add(m[i]);

        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();
        ArrayList <Integer> list3 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            if (x%3==0 && x%2==0) {list1.add(x); list2.add(x);}
            else if (x%3==0) list1.add(x);
            else if (x%2==0) list2.add(x);
            else list3.add(x);
        }
        for (Integer x1: list1) {
            System.out.println(x1);
        }
        for (Integer x2: list2) {
            System.out.println(x2);
        }
        for (Integer x3: list3) {
            System.out.println(x3);
        }
    }
}
