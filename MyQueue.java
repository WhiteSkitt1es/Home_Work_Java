import java.util.LinkedList;

class MyQueue<T> {

   LinkedList<T> linkedList = new LinkedList<>();

   public void enqueue(T element){
      linkedList.addLast(element);
   }

   public T dequeue(){
      return linkedList.removeFirst();
   }

   public T first(){
      return linkedList.element();
   }

   public LinkedList<T> getElements() {
      return linkedList;
   }
}
