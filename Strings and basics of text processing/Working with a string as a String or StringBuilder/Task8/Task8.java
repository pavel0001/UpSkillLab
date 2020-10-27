import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String inputString = input.nextLine();
        printLongerWord(inputString);
    }

    private static void printLongerWord(String inputString) {
        Pattern pattern = Pattern.compile("(\\w++\\s?)");
        Matcher matcher = pattern.matcher(inputString);
        String longerString = "";
        while (matcher.find()) {
            int length = matcher.end() - matcher.start();
            if (length > longerString.length()) {
                longerString = matcher.group(1);
            }
        }
        System.out.println("Longer string -> " + longerString);
    }
}