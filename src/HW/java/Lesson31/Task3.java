package Lesson31;

import java.io.*;
/*Напишите программу, которая получает два положительных числа через программные аргументы
командной строки и выводит true, если первое из чисел нацело делится на другое.
Проверку на кол-во введенных аргументов делать не надо.

Попробуйте решить задание без использования if.

Проверку на кол-во введенных аргументов делать не надо.
Выведите исходные значения и результат. Например:*/
public class Task3 {
    public static void main(String[] args) {
        //В поле "Program arguments" ввести значения 4 и 5 через пробел
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[0]);
        System.out.println(a%b == 0);
    }
}













//        Integer c;
//        try {
////            int result = );
//
//            System.out.println(a % b ==0);
//            System.out.println("True");
//        } catch (Exception ex) {
//
//            System.out.println("False");




//        try
//        {
//           c = Integer.parseInt(args[0])/Integer.parseInt(args[1]);
////            String text = "Hello  World!\nHey! Teachers! Leave the kids alone.";
////            bw.write(text);
//            System.out.println(c);
//        }
//        catch(IOException c){
//
//            System.out.println(c + "False");
//        }


//        x |= input.charAt(1)^'a';
//        x |= input.charAt(2)^'k';
//        x |= input.charAt(3)^'e';
//        x |= input.charAt(4);
//        //дальше несколько утомительный фокус, чтобы превратить ненулевое число в 1
//        x = x | (x>>1) | (x>>2) | (x>>3) | (x>>4) | (x>>5) | (x>>6) | (x>>7) | (x>>8)
//                | (x>>9) | (x>>10) | (x>>11) | (x>>12) | (x>>13) | (x>>14) | (x>>15);
//        x = 1 - (x&1);
//        System.out.print((char)(x*'Y'+(1-x)*'N'));
//        System.out.print((char)(x*'e'+(1-x)*'o'));
//        System.out.println((char)(x*'s'));



