/*
	Name: Permutations
	Author: Kameron Fincher
	Description: Returns Contiguous subarray that sums up to value
	I.E. Command: java SumArray
	
	Instructions:
		Problem 1: Find the Contiguous Subarray with Sum to a Given Value in an array.

		Given an array of positive integer and given value X, find Contiguous sub array whose sum is equal to X.
		For example:

		1
		2
		3
		4
		5
		6
		arr[]={14, 12, 70, 15, 99, 65, 21, 90};
		X =97.
		Sum found between index 1 to 3
		Elements are 12, 17 and 15
*/
import java.util.*;

class SumArray{
	public static void main(String[] args){
		int[] arr= {14, 12, 70, 15, 99, 65, 21, 90};
		int X = 97;
		Integer[] returnVal = helper(arr, X);
		System.out.println(Arrays.toString(returnVal));
	}
	
	public static Integer[] helper(int[] arr, int X){
		for(int i = 0; i < arr.length;i++){
			List<Integer> temp = new ArrayList<Integer>();
			int sum = arr[i];
			temp.add(arr[i]);
			if(sum>X){
				continue;
			}
			if(sum==X){
				Integer[] returnVal = new Integer[temp.size()];
				returnVal = temp.toArray(returnVal);
				return returnVal;
			}
			
			for(int j = i+1;j< arr.length;j++){
				sum+= arr[j];
				temp.add(arr[j]);
				if(sum>X){
					continue;
				}
				if(sum==X){
					Integer[] returnVal = new Integer[temp.size()];
					returnVal = temp.toArray(returnVal);
					return returnVal;
				}
			}
		}
		
		return null;
		
	}
	
	
}