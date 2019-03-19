package schultz.personal.sortalgorithms;

public class SelectionSort {

	public static void main(String[] args) {
		int[] list = {2, 9, 5, 4, 8, 1, 6};
		
		selectionSortTxtBk(list);
		
		printArray(list);
	}
	
	public static void selectionSort(int[] list) {
		int start = 0;
		int min = list[0];
		int minIndex = 0;
		
		while(start < list.length - 1) {
			for(int i = start; i < list.length; i++) {
				if(list[i] < min) {
					min = list[i];
					minIndex = i;
				}
			}
			
			int temp = list[start];
			list[start] = list[minIndex];
			list[minIndex] = temp;
			
			start++;
			min = list[start];
			minIndex = start;
		}
	}
	
	public static void selectionSortTxtBk(int[] list) {
		for(int i = 0; i < list.length-1; i++) {
			int currentMin = list[i];
			int currentMinIndex = i;
			
			for(int j = i + 1; j < list.length; j++) {
				if(currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			if(currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}
	
}
