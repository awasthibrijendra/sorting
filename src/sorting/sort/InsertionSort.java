package sorting.sort;

import java.util.Arrays;

/**
 * Remember array as sorted and unsoted part
 * Start with the second element of the array (As first element is always sorted) 
 * compare next element to all elements in the previous
 * @author bxa721
 * 
 * https://www.youtube.com/watch?v=yCxV0kBpA6M
 *
 */

public class InsertionSort {
	
	public static int [] sortIncreasing(int [] arrayElements){
		for(int i=1; i< arrayElements.length; i++) {
			int tmp=arrayElements[i];
			boolean moreToSort= true;
			for(int j=i-1; j<=0 && moreToSort; j--) {
				if(arrayElements[j]>tmp) {
					arrayElements[j+1]=arrayElements[j];
				}else {
					arrayElements[j+1]=tmp;
					moreToSort=false;
				}
			}
			
		}
		return arrayElements;
	}

}
