public class Task2
{
	public static void main(String[] args) {

	    int z = 97;
	    int[] a = {3,5,6,12,7,345,234,12,877,3,123,543,886,43,46};
	    int counter = 0;
	    System.out.print("Dano a: ");
	    for(int i: a)
	    System.out.print(i+" ");
	    System.out.print("\nZ = "+z);
	    for(int i =0; i< a.length; i++){
	        if(a[i]>z){
	            a[i]=z;
	            counter++;
	        }
	    }
	    System.out.print("\nAfter sort a : ");
	    for(int i: a)
	    System.out.print(i+" ");
	    System.out.print("\nValue of changes = "+counter);
	    
	    
}
}