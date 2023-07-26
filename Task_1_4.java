/*
 *  В файле задано уравнение вида q + w = e (q, w, e >= 0). Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
 *  Восстановите выражение до верного равенства.
    Предложите хотя бы одно решение или сообщите, что его нет.
    Напишите класс Equation, содержащий метод getSolution, который будет считывать уравнение из файла и восстановит его до верного равенства.
    Выведите сначала строку формата "Given the equation: {выражение из файла}".
    А затем верните строку формата "Result: {цельное выражение}".
    Если выражение не имеет решений - верните строку "No solution".
 */

import java.io.BufferedReader;
import java.io.FileReader;

public class Task_1_4 {
    public static void main(String[] args) throws Exception{
        System.out.println(getSolution("input.txt"));
    }
    public static String getSolution(String str) throws Exception {
        // Введите свое решение ниже
        BufferedReader file = new BufferedReader(new FileReader(str));
        String line = file.readLine();
        file.close();
        String[] parts = line.split(" ");
        String[] bigParts = line.split("=");
        String result = "";
        String k = String.format("Given the equation: %s=%s", bigParts[0], bigParts [1]);
        String m = "";
        boolean found = false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int q = Integer.parseInt(parts[0].replace("?", String.valueOf(i)));
                int w = Integer.parseInt(parts[2].replace("?", String.valueOf(j)));
                int e = Integer.parseInt(parts[4]);
                if (check(q, w, e)) {
                    m = String.format("Result: %d + %d = %d", q, w, e);
                    found = true;
                }
            }
        }
        if (!found) {
            m = "No solution";
        }
        result = k + "\n" + m;
        return result;
      }
      public static boolean check(int q, int w, int e) {
        return q + w == e;
      }
}
