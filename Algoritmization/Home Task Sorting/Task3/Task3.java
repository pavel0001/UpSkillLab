public class Task3
{
	public static void main(String[] args) {
		int[] arr = {9,8,7,6,5,12,3,2,1,0};
		int show_iterration = 1; // 1 - Show each iterration, 0 - don't show iterration
		System.out.println("Start array is: ");
		printArr(arr);
		System.out.println("-----------------");
		
		for(int i = 0; i<arr.length; i++){
			for(int a = 0; a<arr.length-1;a++){
				if(arr[a] > arr[a+1]){
					int tmp = arr[a];
					arr[a] = arr[a+1];
					arr[a+1] = tmp;
				}
			}
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