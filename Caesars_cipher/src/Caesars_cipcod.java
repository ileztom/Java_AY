import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Caesars_cipcod {

    public static final String RUSSIAN_ALPHABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    public static final String ENGLISH_ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String text, int shift, String alphabet) {
        StringBuilder result = new StringBuilder();
        int alphabetLength = alphabet.length();

        for (char i : text.toCharArray()) {
            char lowerChar = Character.toLowerCase(i);
            int index = alphabet.indexOf(lowerChar);
            if (index != -1) {
                char base = Character.isLowerCase(i) ? alphabet.charAt(0) : Character.toUpperCase(alphabet.charAt(0));
                char shiftedChar = (char) (base + (index + shift) % alphabetLength);
                result.append(Character.isUpperCase(i) ? Character.toUpperCase(shiftedChar) : shiftedChar);
            } else {
                result.append(i);
            }
        }
        return result.toString();
    }

    public static String decrypt(String text, int shift, String alphabet) {
        return encrypt(text, alphabet.length() - shift, alphabet);
    }

    public static void processFile(String inputFilePath, String outputFilePath, int shift, boolean encrypt, String alphabet) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(inputFilePath.replaceAll("[\"']", ""))));
        String processedContent = encrypt ? encrypt(content, shift, alphabet) : decrypt(content, shift, alphabet);
        Files.write(Paths.get(outputFilePath.replaceAll("[\"']", "")), processedContent.getBytes());
    }

}
