public class Task2
{
	public static void main(String[] args) {
		int[] arr = {9,8,7,6,5,4,3,2,1,0};
		int show_iterration = 1; // 1 - Show each iterration, 0 - don't show iterration
		System.out.println("Start array is: ");
		printArr(arr);
		System.out.println("-----------------");
		for(int i = 0; i<arr.length; i++){
			int min=arr[i];
			int min_ind=i;
			for(int a = i; a<arr.length;a++){
				if(arr[a] < min){
					min = arr[a];
					min_ind = a;
				}
			}
			arr[min_ind] = arr[i];
			arr[i] = min;
			if(show_iterration == 1)
			printArr(arr);
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