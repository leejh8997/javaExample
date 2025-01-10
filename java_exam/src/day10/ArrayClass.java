package day10;

public class ArrayClass {
	
	static int maxValue(int[] array) {
		int max = array[0];
		for(int value : array) {
			if(max < value) {
				max = value;
			}
		}
		return max;
	}
	
	static int maxIndex(int[] array) {
		int index = 0;
		for(int i=0; i<array.length; i++) {
			if(array[index] < array[i]) {
				index = i;
			}
		}
		return index;
	}
	
	static int minValue(int[] array) {
//		int min = array[0];
//		for(int value : array) {
//			if(min > value) {
//				min = value;
//			}
//		}
		int min = array[0];
		for(int value : array) {
			min = value < min ? value : min;
		}
		return min;
	}
	
	static void changeArr(int[] array) {
		int maxindex = 0;
		int minindex = 0;
		
		for(int i=1; i<array.length; i++) {
			maxindex = array[maxindex] < array[i] ? i : maxindex;
		}
		
		for(int i=1; i<array.length; i++) {
			minindex = array[minindex] > array[i] ? i : minindex;
		}
		
		int temp = array[maxindex];
		array[maxindex] = array[minindex];
		array[minindex] = temp;
	}
}
