package Lesson14;

import java.math.BigInteger;

/*
Создать класс Circle, который содержит
        - переменную radius;
        - методы, вычисляющие площадь и длину окружности;
        - константу PI.
 */
public class Circle {
    double radius;
    double pi = Math.PI;
    double valueSquare;
    double valueLenght;

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
