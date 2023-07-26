/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n).
    Внутри класса Answer напишите метод countNTriangle,
    который принимает число n и возвращает его n-ое треугольное число.
    Пример: n = 5 -> 15
 */
public class Task_1_1 {

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