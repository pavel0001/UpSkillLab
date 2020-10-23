/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Pavel_Zmushko

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Task1 {


  public static void main(String[] args) throws IOException {
BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
boolean flag = true;
int number;
do{
	number = Integer.parseInt(reader1.readLine());
	if(number > 0){
		number /= 1;
		flag = false;
	}
	else{
		System.out.println("try again");
	}
}
while(flag);
int result=0;
for(int i = 0; i<number;i++){
	result += i;
}
System.out.println("Sum all number before "+number+" = "+result);

  }
}