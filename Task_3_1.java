public class Task_3_1 {

    public static void main(String[] args) {
        /*
         * Реализовать алгоритм сортировки слиянием.
         */
        int [] result = Merge.sortArray(new int[]{2,3,1,4});
        for (int i = 0; i < result.length ; i++) {
            System.out.print(result[i] + " ");
        }
    }
}