//Pavel_Zmushko
import java.text.SimpleDateFormat;
import java.util.Date;


public class Task5 {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("HH'h' mm'min' ss's' ");
        Date x = new Date(1234234);
        System.out.println(format.format(x));
    }


}
