import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task_6 {

    static Laptop laptop1 = new Laptop("Apple", "Macbook Pro", "m1", 8, 256, "Space gray", 1000);
    static Laptop laptop2 = new Laptop("Apple", "Macbook Pro", "m1", 16, 512, "Silver", 1200);
    static Laptop laptop3 = new Laptop("Apple", "Macbook Air", "m1", 8, 256, "Space gray", 800);
    static Laptop laptop4 = new Laptop("Apple", "Macbook Air", "m1", 16, 512, "Silver", 1000);
    static Laptop laptop5 = new Laptop("Apple", "Macbook Air", "m1", 8, 512, "Gold", 900);
    
    public static void main(String[] args) {
        /*
         * 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
         * 2. Создать множество ноутбуков.
         * 3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
         * Критерии фильтрации можно хранить в Мар. Например: "Введите цифру, соответствующую необходимому критерию:
         * 1 - 03У
         * 2 - Объем ЖД
         * 3 - Операционная система
         * 4 - Цвет ...
         * 1. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Мар.
         * 2. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
         */
        Set<Laptop> set = new HashSet<>();
        set.add(laptop1);
        set.add(laptop2);
        set.add(laptop3);
        set.add(laptop4);
        set.add(laptop5);

        filterLaptop(set);
    }

    public static void filterLaptop(Set<Laptop> set){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Модель");
        map.put(2, "Обьем оперативной памяти");
        map.put(3,"Обьем SSD");
        map.put(4,"Цвет корпуса");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите номер важного критерия");
        System.out.println("1 - Модель");
        System.out.println("2 - Обьем оперативной памяти");
        System.out.println("3 - Обьем SSD");
        System.out.println("4 - Цвет корпуса");
        int select = scanner.nextInt();

        if(map.containsKey(select)){
            System.out.println("Выберите параметр критерия - " + map.get(select));
            switch (select) {
                case 1:
                    System.out.println("1 - Macbook Pro или 2 - Macbook Air");
                    int sel = scanner.nextInt();
                    if (sel == 1){
                        System.out.println(laptop1);
                        System.out.println(laptop2);
                    } else {
                        System.out.println(laptop3);
                        System.out.println(laptop4);
                        System.out.println(laptop5);
                    }
                    break;
            
                case 2:
                    System.out.println("1 - 8gb или 2 - 16 gb");
                    int sel1 = scanner.nextInt();
                    if (sel1 == 1) {
                        System.out.println(laptop1);
                        System.out.println(laptop3);
                        System.out.println(laptop5);
                    } else {
                        System.out.println(laptop2);
                        System.out.println(laptop4);
                    }
                    break;
            
                case 3:
                    System.out.println("1 - 256gb или 2 - 512gb");
                    int sel3 = scanner.nextInt();
                    if(sel3 == 1) {
                        System.out.println(laptop1);
                        System.out.println(laptop3);
                    } else {
                        System.out.println(laptop2);
                        System.out.println(laptop4);
                        System.out.println(laptop5);
                    }
                    break;
            
                case 4:
                    System.out.println("1 - Space gray, 2 - Silver, 3 - Gold");
                    int sel4 = scanner.nextInt();
                    if(sel4 == 1){
                        System.out.println(laptop1);
                        System.out.println(laptop3);
                    } 
                    else if(sel4 == 2) {
                        System.out.println(laptop2);
                        System.out.println(laptop4);
                    } else {
                        System.out.println(laptop5);
                    }
                    break;
            
                default:
                    break;
            }
        } else{
            System.out.println("Введенный номер критерия нет в списке");
        }
    }
}