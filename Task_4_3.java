import java.util.ArrayDeque;
import java.util.Deque;

public class Task_4_3 {

    static Deque<Integer> deque = new ArrayDeque<Integer>();

    public static void main(String[] args) {
        System.out.println(calculate('+', 3, 7));
        System.out.println(calculate('+', 4, 7));
        System.out.println(calculate('<', 0, 0));
    }
    
    static int calculate(char op, int a, int b){
        
        
        int result = 0;
        switch (op) {
            case '+':
                result = a + b;
                deque.add(result);
                break;
            case '-':
                result = a - b;
                deque.add(result);
                break;
            case '/':
                result = a / b;
                deque.add(result);
                break;
            case '*':
                result = a * b;
                deque.add(result);
                break;
            case '<':
                deque.add(deque.getFirst());
                break;
            }
            return deque.getLast();
    }

}
