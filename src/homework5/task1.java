package homework5;

//Дан массив размера  N-1  , который должен содержать только
    // целые числа в диапазоне от  1 до N . Каждое число представлено в одном экземпляре, кроме одного числа.
    // Найдите недостающий элемент.

public class task1 {
    public static void main(String[] args) {
        int N;
        int[] numbers = new int[]{1,2,3,5};
        N = 5;
        int expected_num_sum = N * ((N + 1) / 2);
        int num_sum = 0;
        for (int i: numbers) {
            num_sum += i;
        }
        System.out.print( expected_num_sum - num_sum);
    }
}
