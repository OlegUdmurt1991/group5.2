package Lesson14;

import java.math.BigInteger;

public class Circle {

    double a = 2.0;
    double pi = Math.PI;
    double valueSquare ;
    double valueLenght;

    public void squareCircle(double radius) {
        valueSquare = pi * (Math.pow(radius,a));
        System.out.println("Радиус = " + radius + "Площадь круга = " + valueSquare);
    }
    public void lengthCircle (double radius) {
        valueLenght = pi * (radius+radius);
        System.out.println("Радиус = " + radius + "Длина круга = " + valueLenght);
    }
}
