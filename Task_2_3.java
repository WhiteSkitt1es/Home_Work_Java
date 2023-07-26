public class Task_2_3 {
    public static void main(String[] args) {
        /*
         * Внутри класса Answer напишите метод answer, который распарсит json и,
         * используя StringBuilder, создаст строки вида:
         * Студент [фамилия] получил [оценка] по предмету [предмет].
         */
        String JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
        	"{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
        	"{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        String ELEMENT1 = "Студент ";
        String ELEMENT2 = " получил ";
        String ELEMENT3 = " по предмету ";
        answer(JSON, ELEMENT1, ELEMENT2, ELEMENT3);
    }
    public static StringBuilder answer(String JSON, String ELEMENT1, String ELEMENT2, String ELEMENT3) {
        StringBuilder result = new StringBuilder();

        // Убираем квадратные скобки из JSON-строки, если они есть
        if (JSON.charAt(0) == '[' && JSON.charAt(JSON.length() - 1) == ']') {
            JSON = JSON.substring(1, JSON.length() - 1);
        }

        // Разбиваем JSON-строку на отдельные элементы по символу "},"
        String[] elements = JSON.split("},");
        for (String element : elements) {
            // Удаляем лишние символы '{' и '}' и лишние пробелы
            element = element.replace("{", "").replace("}", "").trim();

            // Разбиваем элемент на поля "фамилия", "оценка" и "предмет"
            String[] fields = element.split(",");
            String surname = fields[0].split(":")[1].replace("\"", "").trim();
            String grade = fields[1].split(":")[1].replace("\"", "").trim();
            String subject = fields[2].split(":")[1].replace("\"", "").trim();

            // Формируем строку и добавляем в StringBuilder
            result.append(ELEMENT1).append(surname).append(ELEMENT2).append(grade).append(ELEMENT3).append(subject).append("\n");
        }

        // Выводим результат на экран
        System.out.print(result.toString());

        return result;
    }
}
