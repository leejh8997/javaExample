package day09;

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

}
