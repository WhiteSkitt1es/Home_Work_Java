/* 
 * Напишите функцию printPrimeNums, которая выведет на экран все простые числа от 1 до 1000,
 * каждое на новой строке.
   Напишите свой код в методе printPrimeNums класса Answer.
   Пример: 1
           2
           3
           5
           7
           11
*/
public class Task_2 {
    public static void main(String[] args) {
        printPrimeNums();
    }
    public static void printPrimeNums(){
        // Напишите свое решение ниже
      System.out.println(1);
        for(int i = 2; i < 1000; ++i){
            int count = 0;
            for(int j = 2; j <=i && count < 2;++j){
              if(i%j==0){
                ++count;
              }
            }
            if(count<2)
               System.out.println(i);
          }
    }

}
