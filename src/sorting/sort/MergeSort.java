package sorting.sort;

import java.util.Arrays;

/**
 * 
 * @author bxa721
 *https://www.youtube.com/watch?v=jlHkDBEumP0
 *https://www.interviewbit.com/tutorial/merge-sort-algorithm/
 *Steps
 *1. Divide the list into list of individual elemets
 *2. Merge the sublist to get one list
 */
public class MergeSort {
	
	public static void main(String[] args) {
		int[] intArr = new int [] {1,2, 8,9};
		int[] intArr1 = new int [] {2,5,11,15};
		int[] intArrCombine = new int [] {2,5,11,15, 1,2, 8,9};
	//	System.out.println(Arrays.toString(mergeIncreasing(intArr, intArr1 )));
		mergeSort(intArrCombine, 0, intArrCombine.length-1 );
		System.out.println(Arrays.toString(intArrCombine));

	}

//	public static int [] mergeIncreasing(int [] left, int [] right){
//		int [] mergeArray= new int [left.length+ right.length];
//		for(int mergentCnt=0, leftCnt=0, rightCnt=0;  mergentCnt< mergeArray.length; mergentCnt++) {
//			if(leftCnt<left.length && rightCnt<right.length && left[leftCnt]<right[rightCnt]) {
//				mergeArray[mergentCnt]=left[leftCnt];
//				leftCnt++;
//			} else if(leftCnt<left.length && rightCnt<right.length && left[leftCnt]>right[rightCnt]){
//				mergeArray[mergentCnt]=right[rightCnt];
//				rightCnt++;
//			} else if(leftCnt<left.length) {
//				mergeArray[mergentCnt]=left[leftCnt];
//				leftCnt++;
//			} else if(rightCnt<right.length) {
//				mergeArray[mergentCnt]=right[rightCnt];
//				rightCnt++;
//			}
//			
//		}
//		return mergeArray;
//	}
	
	public static void mergeAsending(int [] arry, int start, int mid, int end) {
		/**
		 * Have we reached the end of any of the arrays?
		    No:
		        Compare current elements of both arrays 
		        Copy smaller element into sorted array
		        Move pointer of element containing smaller element
		    Yes:
        Copy all remaining elements of non-empty array
		 */
		
		int [] left = new int [mid-start+1];
		int [] right = new int [end-mid];
		for(int i=0, j=start; i<left.length; i++, j++) {
			left[i]=arry[j];
		}
		
		for(int i=0, j=mid+1; i<right.length; i++, j++) {
			right[i]=arry[j];
		}
		
		for(int mergentCnt=start, leftCnt=0, rightCnt=0;  mergentCnt<=end; mergentCnt++) {
			if(leftCnt<left.length && rightCnt<right.length && left[leftCnt]<right[rightCnt]) {
				arry[mergentCnt]=left[leftCnt];
				leftCnt++;
			} else if(leftCnt<left.length && rightCnt<right.length && left[leftCnt]>right[rightCnt]){
				arry[mergentCnt]=right[rightCnt];
				rightCnt++;
			} else if(leftCnt<left.length) {
				arry[mergentCnt]=left[leftCnt];
				leftCnt++;
			} else if(rightCnt<right.length) {
				arry[mergentCnt]=right[rightCnt];
				rightCnt++;
			}
			
		}
		
		
		
	}
	
	public static void mergeSort(int [] arry, int start, int end){
		if(start < end) {
			int mid = (start + end) / 2;
			mergeSort(arry, start, mid);
			mergeSort(arry, mid+1, end);
			mergeAsending(arry, start, mid, end);
		}
	}

}
