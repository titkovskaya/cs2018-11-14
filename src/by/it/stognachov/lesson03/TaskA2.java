package by.it.stognachov.lesson03;

/*
Lesson 03. Task A2. Стихотворение

В созданном вами методе main напишите следующий код:
Запишите свое любимое стихотворение в переменных a b c d и т.д. (типа String)
Выведите одну строку «Мое любимое стихотворение:».
Напишите еще одну строку вывода, но так, чтобы в результате выполнения программы
было выведено ваше любимое стихотворение.
В стихотворении должно быть не меньше, чем 4 строки.

Требования:
1.Программа должна выводить текст.
2.Перед стихом должна быть выведена строка "Мое любимое стихотворение:".
3.Выводимый текст должен состоять не меньше, чем из пяти строк (пустые строки - это тоже строки).
4.В выводимом тексте должно быть не менее, чем 50 символов.
5.Команд System.out.println в коде должно быть максимум две.

Для ручной проверки запустите программу Ctrl+Shift+F10
Для автоматической проверки откройте и запустите класс Testing
*/
class TaskA2 {
    public static void main(String[] args) {
        String a="Не надо бояться густого тумана,\n";
        String b="Не надо бояться пустого кармана.\n";
        String c="Не надо бояться ни горных потоков,\n";
        String d="ни топей болотных, ни грязных подонков!\n";
        String e="Не надо бояться тяжёлой задачи,\n";
        String f="а надо бояться дешёвой удачи.\n";
        String g="Не надо бояться быть честным и битым,\n";
        String h="а надо бояться быть лживым и сытым!\n";
        String i="Умейте всем страхам в лицо рассмеяться, -\n";
        String j="лишь собственной трусости надо бояться!";
        System.out.println("Мое любимое стихотворение:");
        System.out.println(a+b+c+d+e+f+g+h+i+j);
    }
}