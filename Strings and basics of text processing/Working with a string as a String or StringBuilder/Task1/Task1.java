import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Task1 {
    public static void main(String[] args) {
        String inputString = "abcd          gfdg                    a sd  er ";
        int maxSpaces = findMaxConsecutiveSpaces(inputString);
        System.out.println("Max consecutive spaces = " + maxSpaces);
    }

    private static int findMaxConsecutiveSpaces(String inputString) {
        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(inputString);
        int maxSpacesLength = 0;
        while (matcher.find()) {
            int length = matcher.end() - matcher.start();
            if (length > maxSpacesLength) maxSpacesLength = length;
        }
        return maxSpacesLength;
    }
}