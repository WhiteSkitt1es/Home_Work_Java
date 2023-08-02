public class Task_4_2 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue<>();
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
