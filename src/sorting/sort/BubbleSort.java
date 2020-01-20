package sorting.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

}
