import java.util.Arrays; 
public class Task8 {
    public static void main(String args[]) {
      int[] a = {32,2,8,1,654,12,4,23,32,232,97,3,4,2,6};
      
        System.out.print("  Dano a: ");
	    for(int i: a)
	    System.out.print(i+" ");
	    System.out.println("");
	    a = removeMin(a);
	    System.out.print("result a: ");
	    for(int i: a)
	    System.out.print(i+" ");
	    
	    
    }
    public static int[] removeMin(int[] tmp){

        int[] tmpArray = new int[tmp.length-2];
        int min=tmp[0];
        int min_ind = 0;
        for(int i=0;i<tmp.length;i++){
            if(tmp[i]<min) {
                min = tmp[i];
                min_ind = i;
            }
        }
        for(int i = 0, x = 0; i <tmp.length-1;i++){
            if(i == min_ind){
                continue;
            }
            tmpArray[x++] = tmp[i];
        }
	    return tmpArray.clone();
    }
    
}