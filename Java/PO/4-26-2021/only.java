/*
	Name: only
	Author: Kameron Fincher
	Description: Says whether or not the value is reachable given the criteria
	I.E. Command: java only 14 25 7
	
	Instructions:
		Write a function that mimics the following described arithmetic operations.

		Starting with either 3 or 5 and given these operations:
		add 5
		multiply by 3
		You should say if it is possible to reach the target number n.

		Examples
		only5and3(14) ➞ true
		// 14 = 3*3 + 5

		only5and3(25) ➞ true
		// 25 = 5+5+5+5+5

		only5and3(7) ➞ false
		// There exists no path to the target number 7
	
	*/
class only{
	public static void main(String[] args){
		for(String temp : args){
			System.out.println(Integer.valueOf(temp)+" "+only5and3(Integer.valueOf(temp)));
		}
	}
	
	public static boolean only5and3(int value){
		
		return only5and3(value,3) || only5and3(value,5);
	}
	public static boolean only5and3(int value, int sum){
		//System.out.println(value+" "+sum);
		if(sum>=value){
			if(sum==value)
				return true;
			if(sum!=value)
				return false;
		}else{
			boolean retValue = only5and3(value,sum*3) || only5and3(value,sum+5);
			return retValue;
		}
		return false;
	}
}