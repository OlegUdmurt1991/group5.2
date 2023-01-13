package Lesson14;
/*Создать несколько объектов данного класса и вывести на экран:
радиус - площадь - длина окружности*/

public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle(15); //создается объект площадь круга
        Circle circle2 = new Circle(2);  //создается объект Длина круга

        circle1.squareCircle();
        circle2.lengthCircle();

    }
}
