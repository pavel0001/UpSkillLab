import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Task4{
	public static void main (String[] args){
       String input = "    word 111111111  word111 11111w    ordAAAAA AAw1ord1546 ";
	   System.out.println("String input has "+howMuchNumbers(input)+" numbers");
    }
    public static int howMuchNumbers(String input){
		Pattern pattern = Pattern.compile("\\d+\\D?");
		Matcher matcher = pattern.matcher(input);
		int count = 0;
		while(matcher.find()){
			count++;
		}
		return count;
	}
}