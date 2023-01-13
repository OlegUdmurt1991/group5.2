package Lesson14;
/*
Создать класс Circle, который содержит
        - переменную radius;
        - методы, вычисляющие площадь и длину окружности;
        - константу PI. */
public class Circle {
    double radius;
    double pi = Math.PI;
    double valueSquare; //Площадь
    double valueLenght;  //Длина

    public Circle(double radius) {
        this.radius = radius;
    }

    public void squareCircle() {
        valueSquare = pi * (radius * radius);
        System.out.println("Радиус = " + radius + " Площадь круга = " + valueSquare);
    }

    public void lengthCircle() {
        valueLenght = pi * (radius + radius);
        System.out.println("Радиус = " + radius + " Длина круга = " + valueLenght);
    }
}
