//import com.sun.org.apache.xalan.internal.lib.ExsltMath;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int ex1() {

        System.out.println("Введите два числа через пробел.");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println(number1+" больше.");

        }
        if (number1 < number2) {
            System.out.println(number2+" больше.");
        }
        if (number1 == number2) {
            System.out.println("числа равны, попробуйте заново.");
            ex1();
        }

        return number1;
    }

    public static int ex2(){

        System.out.println("Введите два числа через пробел.");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number2 == 0) {
            System.out.println("деление на 0 не возможно.");
        }
        else {
            int delete = number1/number2;
            System.out.println("деление двух чисел равно = "+delete);
        }

        return number1;
    }

    public class Converter {

        public static int stringtoint(String str) throws NumberFormatException {
            return Integer.parseInt(str);
        }
    }

    public class Age {
        public static void validater(int age) throws IllegalArgumentException {
            if (age < 0 || age > 150) {
                throw new IllegalArgumentException("возраст должен быть в диапазоне от 0 до 150.");
            }
            System.out.println("Возраст " + age + " является допустимым.");
        }
    }

    public class SquareRootCalculator {

        public static double calculateSquareRoot(double number) throws IllegalArgumentException {
            if (number < 0) {
                throw new IllegalArgumentException("нельзя вычислить корень из отрицательного числа.");
            }
            return Math.sqrt(number);
        }
    }

    public class FactorialCalculator {

        public static long calculateFactorial(int number) throws IllegalArgumentException {
            if (number < 0) {
                throw new IllegalArgumentException("факториал отрицательного числа не определен.");
            }

            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    public class ArrayZeroChecker {

        public static void checkForZeros(int[] array) throws IllegalArgumentException {
            for (int number : array) {
                if (number == 0) {
                    throw new IllegalArgumentException("массив содержит нули.");
                }
            }
            System.out.println("массив не содержит нулей.");
        }
    }

    public class PowerCalculator {

        public static double power(double base, int exponent) throws IllegalArgumentException {
            if (exponent < 0) {
                throw new IllegalArgumentException("степень не может быть отрицательной.");
            }
            return Math.pow(base, exponent);
        }
    }

    public class StringTrimmer {

        public static String trimString(String input, int length) throws IllegalArgumentException {
            if (length > input.length()) {
                throw new IllegalArgumentException("Длина обрезки больше длины строки.");
            }
            return input.substring(0, length);
        }
    }

    public class BinaryConverter {

        public static String convertToBinary(int number) throws IllegalArgumentException {
            if (number < 0) {
                throw new IllegalArgumentException("Отрицательные числа не поддерживаются.");
            }
            return Integer.toBinaryString(number);
        }
    }

    public class DivisibilityChecker {

        public static boolean isDivisible(int dividend, int divisor) throws ArithmeticException {
            if (divisor == 0) {
                throw new ArithmeticException("Деление на ноль невозможно.");
            }
            return dividend % divisor == 0;
        }
    }

    public class DivisibilityChecker2 {

        public static boolean isDivisible(int dividend, int divisor) throws ArithmeticException {
            if (divisor == 0) {
                throw new ArithmeticException("Деление на ноль невозможно.");
            }
            return dividend % divisor == 0;
        }
    }

    public class ListElementRetriever {

        public static <T> T getElementAtIndex(List<T> list, int index) throws IndexOutOfBoundsException {
            if (index < 0 || index >= list.size()) {
                throw new IndexOutOfBoundsException("Индекс " + index + " выходит за пределы списка.");
            }
            return list.get(index);
        }
    }

    public class DateChecker {

        public static void checkDate(String dateString) throws DateTimeParseException {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            try {
                LocalDate date = LocalDate.parse(dateString, formatter);
                System.out.println("Дата корректна: " + date);
            } catch (DateTimeParseException e) {
                throw new DateTimeParseException("Некорректный формат даты: " + dateString, dateString, e.getErrorIndex());
            }
        }
    }

    public class StringConcatenator {

        public static String concatenateStrings(String str1, String str2) throws NullPointerException {
            if (str1 == null || str2 == null) {
                throw new NullPointerException("Одна из строк равна null.");
            }
            return str1 + str2;
        }
    }

    public class RemainderCalculator {

        public static int calculateRemainder(int dividend, int divisor) throws ArithmeticException {
            if (divisor == 0) {
                throw new ArithmeticException("Деление на ноль невозможно.");
            }
            return dividend % divisor;
        }
    }

    public class SquareRootCalculator1 {

        public static double calculateSquareRoot(double number) throws IllegalArgumentException {
            if (number < 0) {
                throw new IllegalArgumentException("Невозможно вычислить квадратный корень отрицательного числа.");
            }
            return Math.sqrt(number);
        }
    }

    public class TemperatureConverter {

        public static double celsiusToFahrenheit(double celsius) throws IllegalArgumentException {
            // Абсолютный ноль в Цельсиях
            final double ABSOLUTE_ZERO_CELSIUS = -273.15;

            if (celsius < ABSOLUTE_ZERO_CELSIUS) {
                throw new IllegalArgumentException("Температура ниже абсолютного нуля.");
            }

            // Формула для перевода Цельсия в Фаренгейт
            return (celsius * 9 / 5) + 32;
        }
    }

    public class StringChecker {

        public static void checkString(String str) throws IllegalArgumentException {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("Строка не должна быть пустой или равной null.");
            }
        }
    }

        public static void main(String[] args) {

        ex1();

        ex2();

        //3
        String input = "123";

        try {
            int number = Converter.stringtoint(input);
            System.out.println("Конвертированное число: " + number);
        }
        catch (NumberFormatException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        //4

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        try {
            Age.validater(age);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //5

        Scanner scanner3 = new Scanner(System.in);
        double number = scanner3.nextDouble();
        try {
            double result = SquareRootCalculator.calculateSquareRoot(number);
            System.out.println("квадратный корень из " + number + " равен " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //6

        Scanner scanner2 = new Scanner(System.in);
        int number1 = scanner2.nextInt();
        try {
            long result = FactorialCalculator.calculateFactorial(number1);
            System.out.println("Факториал числа " + number1 + " равен " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //7

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите размер массива ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите " + size + " значений для массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner1.nextInt();
        }
        try {
            ArrayZeroChecker.checkForZeros(array);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //8

        double base = 2;
        int exponent = 3;

        try {
            double result;
            result = PowerCalculator.power(base, exponent);
            System.out.println(base + " в степени " + exponent + " равно " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //9

        try {
            String originalString = "Привет, мир!";
            int lengthToTrim = 5;
            String trimmedString = StringTrimmer.trimString(originalString, lengthToTrim);
            System.out.println("Обрезанная строка " + trimmedString);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        //10

        try {
            int numberToConvert = 10; // Пример положительного числа
            String binaryString = BinaryConverter.convertToBinary(numberToConvert);
            System.out.println("Двоичное представление числа " + numberToConvert + ": " + binaryString);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        try {
            int negativeNumber = -5; // Пример отрицательного числа
            String binaryString = BinaryConverter.convertToBinary(negativeNumber);
            System.out.println("Двоичное представление числа " + negativeNumber + ": " + binaryString);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        //11

        try {
            int number11 = 10;
            int number22 = 2;
            boolean result = DivisibilityChecker.isDivisible(number11, number22);
            System.out.println(number11 + " делится на " + number22 + ": " + result);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }

        try {
            int number11 = 10;
            int number22 = 0; // Пример деления на ноль
            boolean result = DivisibilityChecker.isDivisible(number11, number22);
            System.out.println(number11 + " делится на " + number22 + ": " + result);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
        //12

        try {
            int number12 = 10;
            int number21 = 2;
            boolean result = DivisibilityChecker2.isDivisible(number12, number21);
            System.out.println(number12 + " делится на " + number21 + ": " + result);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }

        try {
            int number12 = 10;
            int number21 = 0; // Пример деления на ноль
            boolean result = DivisibilityChecker2.isDivisible(number12, number21);
            System.out.println(number12 + " делится на " + number21 + ": " + result);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
        //13

        List<String> sampleList = List.of("Первый", "Второй", "Третий");

        try {
            int indexToRetrieve = 1; // Пример корректного индекса
            String element = ListElementRetriever.getElementAtIndex(sampleList, indexToRetrieve);
            System.out.println("Элемент по индексу " + indexToRetrieve + ": " + element);
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }

        try {
            int indexToRetrieve = 5; // Пример некорректного индекса
            String element = ListElementRetriever.getElementAtIndex(sampleList, indexToRetrieve);
            System.out.println("Элемент по индексу " + indexToRetrieve + ": " + element);
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
        //15

        String validDate = "25.12.2023"; // Пример корректной даты
        String invalidDate = "2023-12-25"; // Пример некорректной даты

        try {
            DateChecker.checkDate(validDate);
        } catch (DateTimeParseException e) {
            System.err.println(e.getMessage());
        }

        try {
            DateChecker.checkDate(invalidDate);
        } catch (DateTimeParseException e) {
            System.err.println(e.getMessage());
        }
        //16

        String string1 = "Hello, ";
        String string2 = "World!";

        try {
            String result = StringConcatenator.concatenateStrings(string1, string2);
            System.out.println("Результат конкатенации: " + result);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }

        try {
            String string3 = null; // Пример строки, равной null
            String result = StringConcatenator.concatenateStrings(string1, string3);
            System.out.println("Результат конкатенации: " + result);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
        //17

        try {
            int number13 = 10;
            int number23 = 3;
            int remainder = RemainderCalculator.calculateRemainder(number13, number23);
            System.out.println("Остаток от деления " + number13 + " на " + number23 + ": " + remainder);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }

        try {
            int number13 = 10;
            int number23 = 0; // Пример деления на ноль
            int remainder = RemainderCalculator.calculateRemainder(number13, number23);
            System.out.println("Остаток от деления " + number13 + " на " + number23 + ": " + remainder);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
        //18

        try {
            double number14 = 16.0; // Пример положительного числа
            double squareRoot = SquareRootCalculator1.calculateSquareRoot(number14);
            System.out.println("Квадратный корень числа " + number1 + ": " + squareRoot);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        try {
            double number24 = -9.0; // Пример отрицательного числа
            double squareRoot = SquareRootCalculator1.calculateSquareRoot(number24);
            System.out.println("Квадратный корень числа " + number24 + ": " + squareRoot);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        //19

        try {
            double celsius1 = 25.0; // Пример температуры выше абсолютного нуля
            double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius1);
            System.out.println(celsius1 + " °C = " + fahrenheit + " °F");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        try {
            double celsius2 = -300.0; // Пример температуры ниже абсолютного нуля
            double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius2);
            System.out.println(celsius2 + " °C = " + fahrenheit + " °F");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        //20

            try {
                String testString1 = "Hello, World!"; // Пример непустой строки
                StringChecker.checkString(testString1);
                System.out.println("Строка корректна: " + testString1);
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }

            try {
                String testString2 = ""; // Пример пустой строки
                StringChecker.checkString(testString2);
                System.out.println("Строка корректна: " + testString2);
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }

            try {
                String testString3 = null; // Пример строки, равной null
                StringChecker.checkString(testString3);
                System.out.println("Строка корректна: " + testString3);
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
    }
}