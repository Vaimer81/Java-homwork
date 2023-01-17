package homework4;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {


        String[] stringArray= new String[5];

        stringArray[0] = "1";
        stringArray[1] = "2";
        stringArray[2] = "3";
        stringArray[3] = "4";
        stringArray[4] = "5";

      //  String [] cloneStringArray = stringArray.clone();

        String[] Copy = Arrays.copyOfRange(stringArray,0,2);
        String[] Copy1 = Arrays.copyOfRange(stringArray,3,5);

        System.out.println(Arrays.toString(Copy));
        System.out.println(Arrays.toString(Copy1));
    }
}