
public class string {
	
	public int lenght(String str) {
		return 0;
	}
	
	public void evenPositionElements(String str) {
		
	}
	
	public void oddPositionsElements(String str) {
		
	}
	
	public String uppercaseChars(String str) {
		String uppercase="";
		
		for(int i=0; i<str.length(); i++)
			if(Character.isUpperCase(str.charAt(i)))
				uppercase+=str.charAt(i);
		
		return uppercase;
	}
	
	public static String lowerCaseChars(String str) {
		String lowercase="";
		
		for(int i=0; i<str.length(); i++)
			if(Character.isLowerCase(str.charAt(i)))
				lowercase+=str.charAt(i);
		
		return lowercase;
	}
	
	public String nonLetterChars(String str) {
		String notLetter="";
		
		for(int i=0; i<str.length(); i++)
			if(!Character.isLetter(str.charAt(i)))
				notLetter+=str.charAt(i);
		
		return notLetter;
	}

}
