class Task3 {
    public static void main(String[] args) {
        String inputString = "bananab";
        System.out.println(inputString);
        boolean result = checkIfThisStringPolindrom(inputString);
        System.out.println("Is this string polindrom? " + result);
    }

    private static boolean checkIfThisStringPolindrom(String input) {
        StringBuilder builder = new StringBuilder(input);
        String reverseBuilder = new StringBuilder(builder).reverse().toString();
        return builder.toString().equals(reverseBuilder);
    }
}