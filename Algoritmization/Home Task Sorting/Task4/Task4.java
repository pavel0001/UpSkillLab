public class Task4
{
	public static void main(String[] args) {
		int[] arr = {9,8,7,6,5,12,3,2,1,0};
		int show_iterration = 1; // 1 - Show each iterration, 0 - don't show iterration
		System.out.println("Start array is: ");
		printArr(arr);
		System.out.println("-----------------");
		
		for (int left = 0; left < arr.length; left++) {
		int value = arr[left];
		int i = left - 1;
		while(i >= 0){
			if (value < arr[i]) {
				arr[i + 1] = arr[i];
			} else {
				break;
			}
			i--;
		}
		arr[i + 1] = value;
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