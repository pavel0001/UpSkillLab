import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author CodeMachine
 */
public class Task2 {
	public static void main(String[] args) throws IOException {
	//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//    String text = br.readLine();
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int a=0;
	int b=0;
	int h=0;
	boolean flag = true;
	do{	
		System.out.print("Enter a ");
		a = Integer.parseInt(reader.readLine());
		if(a>0){
			System.out.print("Enter b ");
			b = Integer.parseInt(reader.readLine());
			if(b>0){
				System.out.print("Enter h ");
				h = Integer.parseInt(reader.readLine());
				flag = false;
			}
		}
	}
	while(flag);
	foo(a,b,h);
	  }
	public static void foo(int a, int b, int h){
		int min, max;
		if(a>b){
			min = b;
			max = a;
		} else {
			min = a;
			max = b;
		}
		while(min <= max){
			int y_result;
			if(min >2){
				y_result = min;
			}
			else{
				y_result = min*-1;
			}
			System.out.println("x = "+min+"; y = "+y_result);
			min += h;
		}
	}

}
