
public class string {

    public int lenght(String str) {

	return str.length();
    }

    public void evenPositionElements(String str) {
	
	for (int i = 0; i < str.length(); i+=2) {
	    if (str.charAt(i) != ' ') {
		System.out.println(str.charAt(i) + " ");
	    }
	}
    }

    public void oddPositionsElements(String str) {
	for (int i = 1; i < str.length(); i += 2) {

	    if (str.charAt(i) != ' ') {
		System.out.print(str.charAt(i) + " ");
	    }
	}
    }

    public String uppercaseChars(String str) {
	return null;
    }

    public static String lowerCaseChars(String str) {
	return null;
    }

    public String nonLetterChars(String str) {
	return null;
    }

}
