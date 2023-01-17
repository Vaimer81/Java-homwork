package homework3;

public class Task5 {

    static void numberOfLifts (int floor, int stepUp, int stepDown){

        int oneLift = stepUp-stepDown;
        int i = 1;
        while ( oneLift < floor ) {
            System.out.println(oneLift+ ".этаж."+ i+"подем.");
            oneLift= oneLift+stepUp-stepDown;
            i++;
        }
        System.out.println("ВЫ наконецто на месте ");
    }
    public static void main (String[]args){
        int numberOfFloors = 100;
        int up = 10;
        int down = 1;
        numberOfLifts (numberOfFloors, up, down );}

}

