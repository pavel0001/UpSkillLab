import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Task1{
	public static void main (String[] args){
        String[] names = {"liveData", "counterMain", "myFile", "viewModel"};
        names = snakeCaseForArray(names);
        System.out.println(Arrays.toString(names));

    }
    public static String[] snakeCaseForArray(String[] arr){
        String[] tmp = new String[arr.length];
        for(int i =0; i< arr.length; i++) {
            tmp[i] = snakeCase(arr[i]);
        }
        return tmp;
    }
    public static String snakeCase(String str){
        Pattern pattern = Pattern.compile("[A-Z]{1}");
        Matcher matcher = pattern.matcher(str);
        int pos=0;
        char[] tmp = new char[str.length()+1];
            if(matcher.find()){
                pos = matcher.start();
            }
        tmp[pos] = '_';
            for(int i = 0, b =0; i < tmp.length; i++){
                if(i == pos) continue;
                    tmp[i] = str.toCharArray()[b++];
    
            }
        return String.copyValueOf(tmp).toLowerCase();
    }
}