package homework3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("до конца сменны");
        System.out.println("-------------");
        System.out.println("В ведите время в секундах");
        int input = scanner.nextInt();
        int a=0;
        int minutes = input /60;
        int remainingSeconds = input % 60;
        int hours = minutes /60;
        int remainingMinutes = minutes % 60;
        System.out.println(" тебе осталось трудиться:"+hours+" часа: " +remainingMinutes+" минуты: "+remainingSeconds+" секунд");
        while (input!= -1) {
            a += input;
            input = scanner.nextInt();
        }
    }
}
