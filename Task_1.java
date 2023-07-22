/**
 * Task_1
 */
public class Task_1 {

    public static void main(String[] args) {
        System.out.println(countNTriangle(5));
    }
    public static int countNTriangle(int n){
      // Введите свое решение ниже
      if (n == 1){
        return n;
      } else {
        return n + countNTriangle(n - 1);
      }
    }
}