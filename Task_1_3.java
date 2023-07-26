/*
 * Напишите класс Calculator, который будет выполнять математические операции (+, -, *, /)
 * над двумя числами и возвращать результат. В классе должен быть метод calculate,
 * который принимает оператор и значения аргументов и возвращает результат вычислений.
   При неверно переданном операторе, программа должна вывести сообщение об ошибке
   "Некорректный оператор: 'оператор'".
 */
public class Task_1_3 {
    public static void main(String[] args) {
        System.out.println(calculate('+', 2, 2));
    }
    public static int calculate(char op, int a, int b) {
        // Введите свое решение ниже
        int result = 0;
          switch (op) {
              case '+':
                  result = a + b;
                  break;
              case '-':
                  result = a - b;
                  break;
              case '/':
                  result = a / b;
                  break;
              case '*':
                  result = a * b;
                  break;
              default:
                  break;
          }
          return result;    
      }
}
