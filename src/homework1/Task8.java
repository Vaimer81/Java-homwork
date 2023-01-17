package homework1;

public class Task8 {
    public static void main(String[] args) {
        int floor = 200;
        int stepUp = 50;
        int stepDown = 1;
        int numberOfLifts = 1;

        int i;
        for (i = stepUp-stepDown; i < 200; i = i + stepUp - stepDown, numberOfLifts++) {
            System.out.println("You're on " + i + " floor");
        }
        if (i + stepUp - stepDown > 10) System.out.println("You've reached the top floor ");
        System.out.println("You went up " + numberOfLifts + " times");


    }
}




