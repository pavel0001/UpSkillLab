

public class Task3
{
	public static void main(String[] args) {

	    int z = 97;
	    int[] a = {3,5,6,12,0,345,234,12,877,0,123,543,886,43,46,-3,-10,-100};
	    int counter_pos = 0;
	    int counter_neg = 0;
	    int counter_zero = 0;
	    
	    System.out.print("Dano a: ");
	    for(int i: a)
	    System.out.print(i+" ");

	    for(int i : a){
	        if(i>0) counter_pos++;
	        else if (i <0) counter_neg++;
	        else counter_zero++;
	    }

	    System.out.print("\nvalues: >0 - "+counter_pos+"; <0 - "+counter_neg+"; =0 - "+counter_zero);
	    
	    
}
}
