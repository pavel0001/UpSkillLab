import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Task10 {
    private static String getString() {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter string: ");
//        return  input.nextLine();
        return "Строка X состоит из нескольких предложений! Каждое из которых кончается точкой. " +
                "Восклицательным или вопросительным знаком? " +
                "Определить количество предложений в строке X.";
    }

    public static void main(String[] args) {

        String inputString = getString();
        int result = countHowMuchSentences(inputString);
        System.out.println("input string has " + result + " sentences");
    }

    private static int countHowMuchSentences(String inputString) {
        Pattern pattern = Pattern.compile("[.!?]+?");
        Matcher matcher = pattern.matcher(inputString);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }


}
