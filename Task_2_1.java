import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_2_1 {

    public static void main(String[] args) {
        String QUERY = "select * from students where ";
        String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        System.out.println(answer(QUERY,PARAMS));
    }
    public static StringBuilder answer(String QUERY, String PARAMS){
        // Создаем пустой StringBuilder для построения условий WHERE
        StringBuilder whereClause = new StringBuilder();

        // Разбираем JSON-строку, чтобы получить параметры
        Map<String, String> paramsMap = parseJson(PARAMS);

        // Флаг для определения, нужно ли добавлять "AND" перед следующим условием
        boolean needAnd = false;

        // Проверяем каждый параметр и добавляем соответствующее условие в StringBuilder
        if (paramsMap.containsKey("name") && !"null".equals(paramsMap.get("name"))) {
            whereClause.append(needAnd ? " and " : "").append("name='").append(paramsMap.get("name")).append("'");
            needAnd = true;
        }

        if (paramsMap.containsKey("country") && !"null".equals(paramsMap.get("country"))) {
            whereClause.append(needAnd ? " and " : "").append("country='").append(paramsMap.get("country")).append("'");
            needAnd = true;
        }

        if (paramsMap.containsKey("city") && !"null".equals(paramsMap.get("city"))) {
            whereClause.append(needAnd ? " and " : "").append("city='").append(paramsMap.get("city")).append("'");
            needAnd = true;
        }

        if (paramsMap.containsKey("age") && !"null".equals(paramsMap.get("age"))) {
            whereClause.append(needAnd ? " and " : "").append("age=").append(paramsMap.get("age"));
        }

        // Если StringBuilder пустой, значит ни одного параметра не было передано, добавим "1=1" для получения всех записей
        if (whereClause.length() == 0) {
            whereClause.append("1=1");
        }

        // Объединяем начало SQL-запроса и условие WHERE
        StringBuilder fullQuery = new StringBuilder(QUERY);
        fullQuery.append(whereClause);

        return fullQuery;
    }

    // Вспомогательный метод для разбора JSON-строки и преобразования в Map<String, String>
    private static Map<String, String> parseJson(String jsonString) {
        Map<String, String> paramsMap = new HashMap<>();

        if (jsonString == null || jsonString.isEmpty()) {
            return paramsMap;
        }

        jsonString = jsonString.trim();

        // Удаляем фигурные скобки, если они присутствуют
        if (jsonString.charAt(0) == '{' && jsonString.charAt(jsonString.length() - 1) == '}') {
            jsonString = jsonString.substring(1, jsonString.length() - 1);
        }

        // Разделяем пары ключ-значение и добавляем в Map
        String[] pairs = jsonString.split(",");
        for (String pair : pairs) {
            String[] keyValue = pair.trim().split(":");
            if (keyValue.length == 2) {
                String key = keyValue[0].replace("\"", "").trim();
                String value = keyValue[1].replace("\"", "").trim();
                paramsMap.put(key, value);
            }
        }

        return paramsMap;
    }
}