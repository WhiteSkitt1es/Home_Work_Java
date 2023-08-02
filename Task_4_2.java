public class Task_4_2 {
    public static void main(String[] args) {
        /*
         * В классе MyQueue реализуйте очередь с помощью LinkedList со следующими методами:
         * enqueue() - помещает элемент в конец очереди
         * dequeue() - возвращает первый элемент из очереди и удаляет его
         * first() - возвращает первый элемент из очереди, не удаляя
         * getElements() - возвращает все элементы в очереди
         */
        MyQueue<Object> myQueue = new MyQueue<>();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        System.out.println(myQueue.getElements());
        System.out.println();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        System.out.println(myQueue.getElements());
        System.out.println();
        System.out.println(myQueue.first());
    }
}
