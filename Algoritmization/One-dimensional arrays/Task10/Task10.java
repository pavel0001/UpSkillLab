public class Task10 {
    public static void main(String args[]) {
int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
      
        System.out.print("Dano a: ");
	    for(int i: a)
	    System.out.print(i+" ");
	    System.out.println("");
        deleteAllSecend(a);
        System.out.print("Dano a: ");
	    for(int i: a)
	    System.out.print(i+" ");
    }
    public static void deleteAllSecend(int[] arr){
        for(int i =0, k=0; i < arr.length; i++){
            k++;
            if(k==2){
            arr[i] = 0;
            k=0;
            }
        }
        sortArr(arr);
    }
    public static void sortArr(int[] arr){
        for(int i =0; i < arr.length; i++){
            for(int x = i; x < arr.length-1; x++){
                if(arr[x] == 0){
                    arr[x] = arr[x+1];
                    arr[x+1] = 0;
                }
            }
        }
        
    }
}