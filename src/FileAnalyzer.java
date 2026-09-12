import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // Указываем, какой файл хотим открыть
            File myFile = new File("input.txt");
            Scanner scanner = new Scanner(myFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            // Обязательно закрываем сканер после работы
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: Файл не найден!");
        }
    }
}
