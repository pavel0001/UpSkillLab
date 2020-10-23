import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Task3{
	public static void main (String[] args){
       String input = "word 111111111word11111111wordAAAAAAAword";
	   System.out.println("String input has "+howMuchDecimals(input)+" decimals");
    }
    public static int howMuchDecimals(String input){
		Pattern pattern = Pattern.compile("\\d");
		Matcher matcher = pattern.matcher(input);
		int count = 0;
		while(matcher.find()){
			count++;
		}
		return count;
	}
}