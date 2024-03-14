
public class StringRoteted {

	public static void main(String[] args) {

		String str1 = "skilllync";
		String str2 = "yncskilll";
		
		System.out.println(isRoteted(str1, str2)?"Yes":"No");
	}

	private static boolean isRoteted(String str1, String str2) {

		if(str1.length() != str2.length())
		return false;
		
		int len = str2.length();
		String clockRot = str2.substring(2) + str2.substring(0, 2);
		String anticlockRot = str2.substring(len-6, len) + str2.substring(0, 3);
		
		return (str1.equals(clockRot) || str1.equals(anticlockRot));
	}

}
