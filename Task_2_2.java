import java.util.logging.*;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Task_2_2 {
    public static void main(String[] args) throws Exception{
        int[] array = new int[]{9, 4, 8, 3, 1};
        bubbleSort(array);
    }
    public static void bubbleSort(int[] mas) throws Exception {
        // Logger logger = Logger.getLogger(Task_2_2.class.getName());
        // FileHandler fileHandler = new FileHandler("log.txt");
        // logger.addHandler(fileHandler);
        // SimpleFormatter simpleFormatter = new SimpleFormatter();
        // fileHandler.setFormatter(simpleFormatter);
        File log = new File("log.txt");
        FileWriter fileWriter = new FileWriter(log, true);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        int temp = 0;
        for (int j = 0; j < mas.length; j++) {
            for (int i = 0; i < mas.length - 1 - j; i++) {
                if (mas[i] > mas[i + 1]){
                    temp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = temp;
                }
            }
            // logger.info(Arrays.toString(mas));
            fileWriter.write(dateFormat.format(new Date()) + " " + Arrays.toString(mas) + "\n");
        }
        fileWriter.close();
    }
}
