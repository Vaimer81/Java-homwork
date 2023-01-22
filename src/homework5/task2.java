package homework5;

//Дан массив из N целых чисел и целое число  K ,
// найдите количество пар элементов в массиве, сумма которых равна K.

public class task2 {
    public static void main(String[] args) {


        int arr[]={1,2,3,4,5,6};
        int sum=7;
        int arr1[]=new int[sum];


        for(int x=0;x<arr.length;x++)
        {
            arr1[arr[x]]++;
        }

        for(int y=0;y<arr.length;y++)
        {
            if(arr1[sum-arr[y]]==1)
            {

            }
            {
                System.out.print(arr[y]+"+"+(sum-arr[y]));
                System.out.println("="+ sum);
            }
        }

    } }