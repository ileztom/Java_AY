import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Vigeneres_cipcod {

    private static final String ENGLISH_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encrypt(String plaintext, String key) {
        StringBuilder result = new StringBuilder();
        key = key.toUpperCase();
        int keyLength = key.length();
        int keyIndex = 0;

        for (char i : plaintext.toCharArray()) {
            if (Character.isLetter(i)) {
                char upperChar = Character.toUpperCase(i);
                int shift = key.charAt(keyIndex % keyLength) - 'A';
                int index = upperChar - 'A';
                char shiftedChar = (char) ('A' + (index + shift) % 26);
                result.append(shiftedChar);
                keyIndex++;
            } else {
                result.append(i);
            }
        }
        return result.toString();
    }

    public static String decrypt(String ciphertext, String key) {
        StringBuilder result = new StringBuilder();
        key = key.toUpperCase();
        int keyLength = key.length();
        int keyIndex = 0;

        for (char i : ciphertext.toCharArray()) {
            if (Character.isLetter(i)) {
                char upperChar = Character.toUpperCase(i);
                int shift = key.charAt(keyIndex % keyLength) - 'A'; // Определяем сдвиг по ключу
                int index = upperChar - 'A';
                char shiftedChar = (char) ('A' + (index - shift + 26) % 26); // Обратный сдвиг
                result.append(shiftedChar);
                keyIndex++;
            } else {
                result.append(i);
            }
        }
        return result.toString();
    }

    public static void processFile(String inputFilePath, String outputFilePath, String key, boolean encrypt) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(inputFilePath.replaceAll("[\"']", ""))));
        String processedContent = encrypt ? encrypt(content, key) : decrypt(content, key);
        Files.write(Paths.get(outputFilePath.replaceAll("[\"']", "")), processedContent.getBytes());
    }
}