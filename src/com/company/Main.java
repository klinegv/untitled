package com.company;

public class Main {
    public static void main(String[] args) {


        int a = 5;                                      //// ввели данные
        int b = 10;
        int c = 7;
        double D = b * b - 4 * a * c;                   //// формула нахождения дискриминанта



        if (D > 0) ;                                    //// если дискриминант больше нуля
        {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);

            System.our.println(x1, x2);
        }



        if (D = 0) ;                                    //// если равен нулю
        {
            double x;

            x = -b / (2 * a);
            System.our.println(x);

        }
        if (D < 0);                                     //// если меньше нуля
        {
            System.our.println("Нет корней");
        }
    }
}
 