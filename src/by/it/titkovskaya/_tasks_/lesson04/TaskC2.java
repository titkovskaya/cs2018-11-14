package by.it.titkovskaya._tasks_.lesson04;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        if (month==1) System.out.println(day);
        else if (month==2) System.out.println(day+31);
        else if (month==3) System.out.println(day+59);
        else if (month==4) System.out.println(day+90);
        else if (month==5) System.out.println(day+120);
        else if (month==6) System.out.println(day+151);
        else if (month==7) System.out.println(day+181);
        else if (month==8) System.out.println(day+212);
        else if (month==9) System.out.println(day+243);
        else if (month==10) System.out.println(day+273);
        else if (month==11) System.out.println(day+304);
        else if (month==12) System.out.println(day+334);
    }

}
