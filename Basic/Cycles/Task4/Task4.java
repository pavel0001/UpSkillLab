import java.math.BigInteger;
//Pavel_Zmushko
public class Task4 {
public static void main(String[] args) {
	BigInteger tmp = new BigInteger("1");

	for(int i =1; i<=200;i++){
	String mult = String.valueOf(i*i);
    tmp = tmp.multiply(new BigInteger(mult));
	}
	System.out.println("Mult square first 200 number = "+tmp);
}
}