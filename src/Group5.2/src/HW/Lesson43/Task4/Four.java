package HW.Lesson43.Task4;
/*В программу через аргументы командной строки передаются
три натуральных числа – стороны треугольника.


Необходимо определить тип треугольника с данными сторонами
(остроугольный, тупоугольный, прямоугольный)
вывести одно из слов:
- right для прямоугольного треугольника,
- acute для остроугольного треугольника,
- obtuse для тупоугольного треугольника
- или impossible, если входные числа не образуют треугольника.


Стороны сторон передаются через аргументы командной строки.
Проверку на наличие аргументов делать не надо.*/
public class Four {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]); //Первая сторона треугольника
        int b = Integer.parseInt(args[1]); //Вторая сторона треугольника
        int c = Integer.parseInt(args[2]); //Третья сторона треугольника
        int max = Math.max(a, Math.max(b, c)); //Создаем переменную которя выявляет самую длинную сторону
        int min = Math.min(a, Math.min(b, c));//Создаем переменную которя выявляет самую короткую сторону
        int mid = a + b + c - (max + min); //Создаем переменную которя выявляет среднюю сторону
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("impossible, если входные числа не образуют треугольника");
        } else if (max == Math.sqrt((min * min) + (mid * mid))) {
            System.out.println("right для прямоугольного треугольника");
        } else if (max < Math.sqrt((min * min) + (mid * mid))) {
            System.out.println("acute для остроугольного треугольника");
        } else {
            System.out.println("obtuse для тупоугольного треугольника");
        }
    }
}