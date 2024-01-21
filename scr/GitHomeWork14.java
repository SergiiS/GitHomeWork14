import java.util.Random;

public class GitHomeWork14 {
    public static void main(String[] args) {

        int theRandomNumber = generateTheRandomNumber(11, 100011);

        int digitSum = calculateDigitSum(theRandomNumber);

        System.out.println("Випадкове число є: " + theRandomNumber);
        System.out.println("Сума усіх чисел в випадковом числі є: " + digitSum);
    }

    public static int generateTheRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public static int calculateDigitSum(int number) {
        int sum = 0;

        String numberAsString = String.valueOf(number);

        for (int i = 0; i < numberAsString.length(); i++) {
            char digitChar = numberAsString.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            sum += digit;
        }

        return sum;
    }
}