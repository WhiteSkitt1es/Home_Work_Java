import java.util.Arrays;

public class Task_3_2 {
    public static void main(String[] args) {
        /*
         * Написать функцию которая принимает массив целых чисел и выдавал массив нечетных чисел. 
         */
        int[] arr = new int[]{2, 4, 6, 8};
        removeEvenNumbers(arr);
    }

    public static void removeEvenNumbers(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                count++;
            }
        }

        int[] list = new int[count];
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                list[count] = arr[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(list));
    }
}
