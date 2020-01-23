package sorting.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order
 * @author bxa721
 *
 */
public class BubbleSort {
	
	public static List<Sorttable> sort(List<Sorttable> elements){
		Sorttable [] arrayElements = (Sorttable[]) elements.toArray();
		boolean moreToSort= false;
		
		do{
			moreToSort = false;
			for(int i=0; i< arrayElements.length; i++) {
				if(i+1<arrayElements.length-1 && arrayElements[i].compare(arrayElements[i+1])>0) {
					Sorttable c = arrayElements[i];
					arrayElements[i]= arrayElements[i+1];
					arrayElements[i+1]=c;
					moreToSort= true;
				}
			}
		}while(moreToSort);
		
		return Arrays.asList(arrayElements);
	}
	
	public static int [] sort(int [] arrayElements){
		boolean moreToSort= false;
		
		do{
			moreToSort = false;
			for(int i=0; i< arrayElements.length; i++) {
				if(i+1<arrayElements.length && arrayElements[i]>arrayElements[i+1]) {
					int c = arrayElements[i];
					arrayElements[i]= arrayElements[i+1];
					arrayElements[i+1]=c;
					moreToSort= true;
				}
			}
		}while(moreToSort);
		
		return arrayElements;
	}
	
	//https://www.youtube.com/watch?v=o4bAoo_gFBU&list=PLdo5W4Nhv31bEiyP4tclZMc5mP_X7OD7k
	static int[] sortImproved(int[] a) {
		for(int i=0;i<a.length; i++) {
			boolean moreToSort =false;
			for(int j=0; j<a.length-1; j++) {
				if(a[j] > a[j + 1]) {
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1]= tmp;
					moreToSort= true;
				}
			}
			//no sorting is done in the above loop that means the loop is sorted
			if(!moreToSort) {
				break;
			}
			
		}
		return a;

	 }

}
