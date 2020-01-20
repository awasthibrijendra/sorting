package sorting.sort;

import java.util.Arrays;

public class InsertionSort {
	
	public static int [] sort(int [] arrayElements){
		
		int sortedIndex=1;
		
		do{
			//int[] sortedArray = Arrays.copyOf(arrayElements, sortedIndex+1);
			//int[] unSortedArray = Arrays.copyOfRange(arrayElements, sortedIndex+1, arrayElements.length);
			for(int i=sortedIndex; i< arrayElements.length; i++) {
				int tmp=arrayElements[i];
				for(int j=0; j< i; j++) {
					if(arrayElements[j]<tmp) {
						arrayElements[i]=arrayElements[j];
					}
				}
			}
		}while(sortedIndex<arrayElements.length);
		
		return arrayElements;
	}

}
