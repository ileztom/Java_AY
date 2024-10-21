import java.io.*;
import java.util.Scanner;

public class Main {

    private static final String ENGLISH_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите путь к входному файлу:");
            String inputFilePath = scanner.nextLine().replaceAll("[\"']", "");
            System.out.println("Введите путь к выходному файлу:");
            String outputFilePath = scanner.nextLine().replaceAll("[\"']", "");
            System.out.println("Введите ключ:");
            String key = scanner.nextLine();
            System.out.println("Выберите режим работы (1 - шифрование, 2 - расшифровка):");
            int mode = Integer.parseInt(scanner.nextLine());

            if (mode == 1) {
                Vigeneres_cipcod.processFile(inputFilePath, outputFilePath, key, true);
                System.out.println("Текст зашифрован и записан в " + outputFilePath);
            } else if (mode == 2) {
                Vigeneres_cipcod.processFile(inputFilePath, outputFilePath, key, false);
                System.out.println("Текст расшифрован и записан в " + outputFilePath);
            } else {
                System.out.println("Неверный режим работы.");
            }

        } catch (IOException e) {
            System.err.println("Ошибка при обработке файла: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат режима работы.");
        } finally {
            scanner.close();
        }
    }
}
