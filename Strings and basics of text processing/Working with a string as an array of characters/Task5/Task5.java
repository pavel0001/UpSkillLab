import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Task5{
	public static void main (String[] args){
       String input = "   Text     text   text   ";
	   System.out.println("String after remove over space: \n["+removeAllOverSpace(input)+"]");
    }
    public static String removeAllOverSpace(String input){
		Pattern pattern = Pattern.compile("\\s+^|\\s+|\\s+$");
		return input.replaceAll("^\\s+|\\s+$","").replaceAll("\\s{2,}"," ");

	}
}