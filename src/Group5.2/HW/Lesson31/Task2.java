package Lesson31;
/*Даны две целые переменные a, b. Напишите программу, после исполнения которой значения переменных поменялись бы местами (новое значение a равно старому значению b и наоборот), но без использования дополнительной переменной.
Выведите исходные значения и результат. Например:
     Дано: a = 4, b = 5
     После перестановки: a = 5, b = 4*/
public class Task2 {
    public static void main(String[] args) {
        //В поле "Program arguments" ввести значения 4 и 5 через пробел
        String a = args[1];
        String b =args[0];
        System.out.println("a = " + a);
        System.out.println("b = " + b + '\n');

        a= args[0];
        b= args[1];
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }





}
