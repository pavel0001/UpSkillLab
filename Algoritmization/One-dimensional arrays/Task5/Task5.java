public class Task5 {
    public static void main(String args[]) {
      int[] a = {32,2,8,1,654,12,4,-100500,32,232,97,3};
      
        System.out.print("Dano a: ");
	    for(int i: a)
	    System.out.print(i+" ");
	    System.out.println("\nPrint numbers when a[i]> i:");
	    for(int i =0;i<a.length;i++){
	        if(a[i]>i){
	            System.out.print(a[i]+" ");
	        }
	    }
    }
}