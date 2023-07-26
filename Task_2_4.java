import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task_2_4 {
    public static void main(String[] args) throws Exception {
        /*
         * Возьмите код от калькулятора с прошлого урока.
         * К этому калькулятору нужно добавить логирование.
         */
        calculate('+', 2, 2);
    }
    public static int calculate(char op, int a, int b) throws Exception {
        File log = new File("log.txt");
        FileWriter fileWriter = new FileWriter(log);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
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
            fileWriter.write(dateFormat.format(new Date()) + " " + "User entered the first operand = " + Integer.toString(a) + "\n");
            fileWriter.write(dateFormat.format(new Date()) + " " + "User entered the operation = " + Character.toString(op) + "\n");
            fileWriter.write(dateFormat.format(new Date()) + " " + "User entered the second operand = " + Integer.toString(b) + "\n");
            fileWriter.write(dateFormat.format(new Date()) + " " + "Result is " + Integer.toString(result) + "\n");
            fileWriter.flush();
            fileWriter.close();
            return result;    
    }
}
