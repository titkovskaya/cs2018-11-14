package by.it.titkovskaya._tasks_.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;
import java.util.Collections;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "А если это так,","то что есть красота?","И почему ее обожествляют люди?","Сосуд она, в котором пустота?","Или огонь, мерцающий в сосуде?");
        System.out.println(list.size());
        for (String line: list) {
            System.out.println(line);
        }
    }
}

