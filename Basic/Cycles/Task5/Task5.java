/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Pavel_Zmushko


public class Task5 {

    public static void main(String args[]) {
        for(int i=0 ; i <= 126 ; i++){
            System.out.print(i+" = '"+(char) i+"' ");
            if(i%10 == 0){
                System.out.println("\n");
            }
        }
    }
}