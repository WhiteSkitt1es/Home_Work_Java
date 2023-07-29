import java.util.Arrays;

public class Task_3_3 {
    public static void main(String[] args) {
        /*
         * Написать функцию которая принимает массив и:
         * - Сортирует его и выводит его в консоль.
         * - Находит минимальное значение массива.
         * - Находит максимальное значение массива.
         * - Находит среднеарифметическое.
         */
        Integer[] arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        analyzeNumbers(arr);
    }
    public static void analyzeNumbers(Integer[] arr){
        System.out.println(Arrays.toString(bubbleSort(arr)));
        System.out.println("Minimum is " + Integer.toString(minValue(bubbleSort(arr))));
        System.out.println("Maximum is " + Integer.toString(maxValue(bubbleSort(arr))));
        System.out.println("Average is " + Integer.toString(mean(bubbleSort(arr))));
    }

    static Integer[] bubbleSort(Integer[] mas){
        int temp = 0;
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]){
                    isSorted = false;
                    temp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = temp;
                }
            }
        }
        return mas;
    }
    
    static int minValue(Integer[] arr){
        return arr[0];
    }

    static int maxValue(Integer[] arr){
        return arr[arr.length - 1];
    }

    static int mean(Integer[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum / arr.length;
    }
}
