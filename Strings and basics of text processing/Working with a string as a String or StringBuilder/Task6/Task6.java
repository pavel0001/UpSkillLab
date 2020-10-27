
class Task6 {
    public static void main(String[] args) {
        String inputString = "Belarus is alive";
        System.out.println(inputString);
        String newString = makeDoubleEachSimbol(inputString);
        System.out.println("New string -> " + newString);
    }

    private static String makeDoubleEachSimbol(String inputString) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            char charAtIndex = inputString.charAt(i);
            builder.append(charAtIndex);
            builder.append(charAtIndex);
        }
        return builder.toString();
    }
}