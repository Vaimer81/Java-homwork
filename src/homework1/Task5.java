package homework1;

public class Task5 {
    public static void main(String[] args) {
        int b=0;
        for (int i = 50; i <= 200; i = i + 50-1) {
            b++;
            //System.out.print(i+ "-"+ b);
            System.out.print("количество подемов "+ b);
            System.out.print("этаж");
            System.out.println(i);
        }

    }
}