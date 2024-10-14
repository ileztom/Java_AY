import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите путь к входному файлу:");
            String inputFilePath = scanner.nextLine().replaceAll("[\"']", "");
            System.out.println("Введите путь к выходному файлу:");
            String outputFilePath = scanner.nextLine().replaceAll("[\"']", "");
            System.out.println("Введите ключ (сдвиг):");
            int shift = Integer.parseInt(scanner.nextLine());
            System.out.println("Выберите режим работы (1 - шифрование, 2 - расшифровка):");
            int mode = Integer.parseInt(scanner.nextLine());
            System.out.println("Выберите язык (1 - русский, 2 - английский):");
            int language = Integer.parseInt(scanner.nextLine());

            String alphabet = language == 1 ? Caesars_cipcod.RUSSIAN_ALPHABET : Caesars_cipcod.ENGLISH_ALPHABET;

            if (mode == 1) {
                Caesars_cipcod.processFile(inputFilePath, outputFilePath, shift, true, alphabet);
                System.out.println("Текст зашифрован и записан в " + outputFilePath);
            } else if (mode == 2) {
                Caesars_cipcod.processFile(inputFilePath, outputFilePath, shift, false, alphabet);
                System.out.println("Текст расшифрован и записан в " + outputFilePath);
            } else {
                System.out.println("Неверный режим работы.");
            }

        } catch (IOException e) {
            System.err.println("Ошибка при обработке файла: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат ключа или режима работы.");
        } finally {
            scanner.close();
        }
    }
}