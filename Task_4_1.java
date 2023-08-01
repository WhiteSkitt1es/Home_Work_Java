import java.util.LinkedList;

public class Task_4_1 {

    public static void main(String[] args) {
        /*
         * Напишите класс LLTasks с методом revert,
         * который принимал бы на вход LinkedList и возвращает “перевернутый” список.
         * 
         * Пример:
         * [1, One, 2, Two]
         * 
         * [1, One, 2, Two]
         * [Two, 2, One, 1]
         */
        LinkedList<Object> ll = new LinkedList<>();
        ll.add(1);
        ll.add("One");
        ll.add(2);
        ll.add("Two");
        System.out.println(ll);
        System.out.println(revert(ll));
    }

    public static LinkedList<Object> revert(LinkedList<Object> ll){
        LinkedList<Object> list = new LinkedList<>();
        while(!ll.isEmpty()){
            list.add(ll.removeLast());
        }
        return list;
    }
}