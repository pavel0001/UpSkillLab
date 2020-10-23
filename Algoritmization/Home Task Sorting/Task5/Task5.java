public class Task5
{
	public static void main(String[] args) {
		int[] arr = {9,23,8,7,6,5,12,3,2,1,0};
		int show_iterration = 1; // 1 - Show each iterration, 0 - don't show iterration
		System.out.println("Start array is: ");
		printArr(arr);
		System.out.println("-----------------");
		for (int step = arr.length / 2; step > 0; step /= 2) {
            for (int i = step; i < arr.length; i++) {
                for (int j = i - step; j >= 0 && arr[j] > arr[j + step] ; j -= step) {
                    int x = arr[j];
                    arr[j] = arr[j + step];
                    arr[j + step] = x;
                }
            }
		if(show_iterration == 1){
			printArr(arr);
		}
        }
		
		System.out.print("After last iteration:\n");
		printArr(arr);
	}
public static void printArr(int[] arr){
	for(int i: arr)
	System.out.print(i + " ");
	System.out.println("");
}
}