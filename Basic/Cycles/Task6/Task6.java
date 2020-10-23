//Pavel_Zmushko

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {

  public static void main(String[] args) throws IOException {
  	
	BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
	boolean flag = true;
	int m = 0;
	int n = 0;
	do{
		System.out.print("Enter m: ");
		m = Integer.parseInt(reader1.readLine());
		if(m > 0){
			m /= 1;
			System.out.print("Enter n (It's must be least than m): ");
			n = Integer.parseInt(reader1.readLine());
			if(n>0 && n>m) {
				n /= 1;
				flag = false;
			}
		}
		else{
			System.out.println("try again");
		}
	}
	while(flag);
	
	for(int i = m; i <= n; i++){
		System.out.print("Number "+i+" has next deliteli: ");
		for(int x = 2; x < i; x++){
			if(i%x==0){
				System.out.print(x+" ");
			}
		}
		System.out.println("");
	}
	

  }
}