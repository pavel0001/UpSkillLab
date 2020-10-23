public class Task4 {
    public static void main(String args[]) {
      int[] a = {32,543,8,3,654,12,98,-100500,32,232,97,3};
      
        System.out.print("       Dano a: ");
	    for(int i: a)
	    System.out.print(i+" ");
	    int min_ind = 0;
	    int max_ind = 0;
        int min=a[0];
        int max = a[0];
        
	    for(int i =0;i<a.length;i++){
	        if(a[i] < min) { 
	            min = a[i];
	            min_ind = i;
	        }
	        else if(a[i] > max){
	            max = a[i];
	            max_ind = i;
	        }
	        
	    }
	    System.out.println("\nmin ="+a[min_ind]+" max= "+a[max_ind]);
	    int tmp;
	    tmp= a[min_ind];
	    a[min_ind] = a[max_ind];
	    a[max_ind] = tmp;
        System.out.print("\nBefore sort a: ");
	    for(int i: a)
	    System.out.print(i+" ");
    }
}