class Inversion{
	public static void main(String[] args){
		System.out.println(invert("dLROW YM sI HsEt"));
		System.out.println(invert("ytInIUgAsnOc"));
		System.out.println(invert("step on NO PETS"));
		System.out.println(invert("XeLPMoC YTiReTXeD"));
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