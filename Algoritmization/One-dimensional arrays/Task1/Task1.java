public class Task1
{
	public static void main(String[] args) {

	    int k = 3;
	    int[] a = {3,5,6,12,7,345,234,12,877,3,123,543,886,43,46};
	    int sum = 0;
		System.out.print("Dano: ");
		for(int i: a) System.out.print(i+" ");
	    System.out.print("\nk= "+k+". n= "+a.length+": Numbers kratnie k from a: \n");
	    for(int i : a){
	        if(i%k == 0){
	            System.out.print(i+" ");
	        sum += i;
	        }
	    }
	    System.out.println("\n Their sum equals = "+sum);

	}
}
