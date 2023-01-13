package Lesson14;
/*Создать несколько объектов данного класса и вывести на экран:
радиус - площадь - длина окружности*/

public class Main {
    public static void main(String[] args) {

        Circle resultNumbers = new Circle(15);
        Circle resultNumbers2 = new Circle(2);

        resultNumbers.squareCircle();
        resultNumbers2.lengthCircle();

    }
}
