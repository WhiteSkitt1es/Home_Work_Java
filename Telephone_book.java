import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Telephone_book {
    
    Map<String, List<String>> book = new TreeMap<>(Comparator.reverseOrder());

    Map<String, List<String>> printBook(){
        return book;
    }

    String printContact(String name){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);
        stringBuilder.append("=");
        stringBuilder.append(book.get(name));
        return stringBuilder.toString();
    }
    
    void addContact(String name, String number){
        if(book.containsKey(name)){
            List<String> list = book.get(name);
            list.add(number);
        } else {
            List<String> list = new ArrayList<>();
            list.add(number);
            book.put(name, list);
        }
    }
    
    void deleteContact(String name){
        book.remove(name);
    }
}
