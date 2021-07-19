/*
	Name: Permutations
	Author: Kameron Fincher
	Description gives permutation based on input array
	I.E. Command: java Permutation 10 20 30
	
	Instructions:
		Weekly Coding Challenge:

		Given array of distinct integers, print all permutations of the array.
		For example :
		array : [10, 20, 30]

		Permutations are :

		[10, 20, 30]
		[10, 30, 20]
		[20, 10, 30]
		[20, 30, 10]
		[30, 10, 20]
		[30, 20, 10]
*/
import java.util.Arrays;
class Permutations{
	public static void main(String[] args){
		int[] unalteredArr = new int[args.length];
		for(int i = 0; i<args.length; i++){
			unalteredArr[i] = Integer.parseInt(args[i]);
		}
		
		for(int i = 0; i<unalteredArr.length; i++){
			int[] arr = unalteredArr.clone();
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			recursiveArr(arr, 1);
			
		}
		
		
	}
	public static void recursiveArr(int[] arr, int index){
		System.out.println(Arrays.toString(arr));
		if(index<arr.length-1){
			int temp = arr[index];
			arr[index] = arr[index+1];
			arr[index+1] = temp;
			recursiveArr(arr, index+1);
		}
	}
}