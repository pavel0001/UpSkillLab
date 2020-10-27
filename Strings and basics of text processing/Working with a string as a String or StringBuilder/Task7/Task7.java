import java.util.Scanner;
class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String inputString = input.nextLine();
        String newString = deleteDoubleSymbolsAndSpaces(inputString);
        System.out.println("After changes: -> "+newString);

    }

    private static String deleteDoubleSymbolsAndSpaces(String inputString) {
        String stringWithoutSpaces = inputString.replaceAll("\\s+", "");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < stringWithoutSpaces.length(); i++) {
            char symbol = stringWithoutSpaces.charAt(i);
            if (!isThisSymbolInString(builder, symbol)) {
                builder.append(symbol);
            }
        }
        return builder.toString();
    }

    private static boolean isThisSymbolInString(StringBuilder input, char symbol) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                return true;
            }
        }
        return false;
    }


}