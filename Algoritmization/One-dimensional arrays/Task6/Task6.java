public class Task6 {
    public static void main(String args[]) {
      int[] a = {32,2,8,1,654,12,4,23,32,232,97,3,4,2,6};
      
        System.out.print("Dano a: ");
	    for(int i: a)
	    System.out.print(i+" ");
        int sum=0;
        System.out.print("\nNatural is number - ");
	    for(int i =0;i<a.length;i++){
	        if(isSimpleNumber(i)){
	            sum += a[i];
	            System.out.print(i+" ");
	        }
	    }
	    System.out.println("\nsum = "+sum);
    }
    public static boolean isSimpleNumber(int a){
        if(a!=0){
        for(int i=2;i<a;i++){
            if(a%i == 0){
                return false;
            }
        }
        return true;
        }
        return false;
    }
}