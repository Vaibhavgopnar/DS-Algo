
public class removeduplicates {

	static void remove(String str) {
		int n = str.length();
		
		String str2 = "";
		for(int i = 0; i <n; i++){				
			char ch = str.charAt(i);
			if(str2.indexOf(ch) <0) {
				str2 = str2 + ch;
			}	
		}
		System.out.println(str2);
	}
	
	public static void main(String[] args) {

		String str = "skill lync cours e ";
		remove(str);
	}

}
