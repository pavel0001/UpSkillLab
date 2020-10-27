import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String inputString = input.nextLine();
        countSmallAndLargeBukv(inputString);
    }

    private static void countSmallAndLargeBukv(String inputString) {
        Pattern pattern = Pattern.compile("([a-z]{1})|([A-Z]{1})");
        Matcher matcher = pattern.matcher(inputString);
        int counterSmall = 0;
        int counterLarge = 0;
        while (matcher.find()) {
            if (matcher.group(1) != null) {
                counterSmall++;
            } else if (matcher.group(2) != null) {
                counterLarge++;
            }
        }
        System.out.println("Input string has " + counterSmall + " small , and " + counterLarge + " large symbol");
    }
}
