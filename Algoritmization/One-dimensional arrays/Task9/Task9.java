public class Task9 {
    public static void main(String args[]) {
int[] a = {1,1,512,2,2,2,3,3,3,3,512,512,512,3,2,5,512,512,3};
      
        System.out.print("Dano a: ");
	    for(int i: a)
	    System.out.print(i+" ");
	    System.out.println("");

      System.out.println(foo(a));
    }
    
    public static String foo(int[] arr){
        int[][] tmp = getCopy(arr);
        int max=tmp[0][0];
        int max_ind=0;
        for(int i = 0; i< tmp.length; i++){
            if(tmp[i][1] > max){
                max = tmp[i][1];
                max_ind = i;
            } else if(tmp[i][1] == tmp[max_ind][1]){
                if(tmp[i][0]<tmp[max_ind][0]){
                    max = tmp[i][1];
                    max_ind = i;
                }
            }
        }
        return "Most common number is "+tmp[max_ind][0]+" it common "+tmp[max_ind][1];
        
    }
    public static int[][] getCopy(int[] arr){
        int[][] tmp = new int[arr.length][2];
        for(int i = 0; i < arr.length; i++){
            tmp[i][0] = arr[i];
            tmp[i][1] = howMuchThisNumbInArr(arr[i], arr);
        }
        return tmp;
    }
    public static int howMuchThisNumbInArr(int numb, int[] arr){
        int counter=0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == numb){
                counter++;
            }
        }
        return counter;
    }

}