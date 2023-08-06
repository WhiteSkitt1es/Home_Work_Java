public class Task_5 {
    /*
     * Реализуйте структуру телефонной книги с помощью HashMap.
     * Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
     * их необходимо считать, как одного человека с разными телефонами.
     * Вывод должен быть отсортирован по убыванию числа телефонов.
     */

     public static void main(String[] args) {
        Telephone_book tBook = new Telephone_book();
        tBook.addContact("Alex", "89091234565");
        tBook.addContact("Pavel", "89056666216");
        tBook.addContact("Pavel", "89991387292");
        tBook.addContact("Kirill", "89601789905");
        tBook.addContact("Kirill", "89991234567");
        tBook.addContact("Pavel", "89991384242");
        System.out.println(tBook.printBook());
        System.out.println(tBook.printContact("Alex"));
        tBook.deleteContact("Alex");
        System.out.println(tBook.printBook());
     }
}
