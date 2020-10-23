//Pavel_Zmushko

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {

  public static void main(String[] args) throws IOException {
  	
	BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
	boolean flag = true;
	int m = 0;
	int n = 0;
	do{
		System.out.print("Enter m: ");
		m = Integer.parseInt(reader1.readLine());
		m /= 1;
		System.out.print("Enter n (It's must be least than m): ");
		n = Integer.parseInt(reader1.readLine());
		n /= 1;
		flag = false;

	}
	while(flag);
	foo(m);
	foo(n);

  }
  public static void foo(int a){
	System.out.print("Number "+a+" has next literal: ");
  	while(true){
		System.out.print(a%10+" ");
		a /=10;
		if(a == 0){
			break;
		}

	}
  	System.out.println("");
  }
}