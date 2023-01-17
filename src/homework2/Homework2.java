package homework2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //0.Перевести число 333 из шестнадцатиричной в десятичную
        String число1 ="333";
        int dcimalNumber = Integer.parseInt(число1,16);
        System.out.println(dcimalNumber);
        //2.Перевести 637 из десятичной в шестнадцатиричную и обратно (10->16 и 16->10)
        int число4 =637;
        String toHexNummer = Integer.toString(число4,16);
        System.out.println(toHexNummer);

        //3.Перевести 637 из десятичной в двоичную
        int число3 = 637;
        String toBinaryNummer = Integer .toString(число3,3);
        System.out.println(toBinaryNummer);
        //4.11100111 перевести в десятичную
        String число5 ="11100111";
        int decimalNumber = Integer.parseInt(число5,2);
        System.out.println(decimalNumber);
        //5.Перевести 637 из десятичной в троичную
        int число2 = 637;
        String threeRankNumber = Integer .toString(число2,2);
        System.out.println(threeRankNumber);

        // задание 3
        Scanner sc = new Scanner(System.in);
        System.out.println("мама");
        System.out.println("миша");
        String мама = sc.next();
        String word = sc.nextLine();
        System.out.println("" );

        // калькулятор валют
        convertEurToUsd(5, 1.2);
        convertEurToUsd(5, 2);

    }

    public static void convertEurToUsd(int eur, double course) {
        System.out.println(eur*course);


    }
}


