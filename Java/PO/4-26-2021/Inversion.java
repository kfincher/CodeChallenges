/*
	Name: only
	Author: Kameron Fincher
	Description: Reverses built in strings
	I.E. Command: java Inversion dLROW YM sI HsEt
	
	Instruction: 
		Write a recursive function that takes a string input and returns the string in a reversed case and order.

		Examples
		invert("dLROW YM sI HsEt") ➞ "TeSh iS my worlD"

		invert("ytInIUgAsnOc") ➞ "CoNSaGuiNiTY"

		invert("step on NO PETS") ➞ "step on NO PETS"

		invert("XeLPMoC YTiReTXeD") ➞ "dExtErIty cOmplEx"
*/
class Inversion{
	public static void main(String[] args){
		String concat = "";
		for(int i = 0;i<args.length;i++){
			concat+= args[i];
			if(i!=args.length-1){
				concat+=" ";
			}
		}
		System.out.println(invert(concat));
	}
	
	public static String invert(String temp){
		return invert(temp, "");
	}
	
	public static String invert(String temp, String constructedString){
		if(constructedString.length()>=temp.length()){
			return constructedString;
		}else{
			int intChar = Integer.valueOf(temp.charAt(temp.length()-constructedString.length()-1));
			
			if(intChar>=65&&intChar<=90||intChar>=97&&intChar<=122)
				intChar = intChar>=97 ? intChar-32 : intChar+32;
			
			Character chr = (char)intChar; 
			return invert(temp, constructedString+chr);
		}
	}
}