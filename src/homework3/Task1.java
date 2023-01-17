package homework3;

public class Task1 {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isRain = false;
        String canWalk = "Можно идти гулять";

        if (isWeekend && isRain) {
            System.out.println(canWalk);
        } else {
            System.out.println("Прогулка отменяется");
        }
    }
}


