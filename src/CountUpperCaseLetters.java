
public class CountUpperCaseLetters {
	
	public static int countUpperCaseLetters(String in) {
		int count=0;
		for(int i=0;i<in.length();i++) {
			if(Character.isUpperCase(in.charAt(i))){
				count++;
			}
			
		}
		return count;
		
	}

	public static void main(String[] args) {
		System.out.println(countUpperCaseLetters("Amazon"));
		System.out.println(countUpperCaseLetters("Amazing Amazon"));
		System.out.println(countUpperCaseLetters("Amazing AMAZON"));
		System.out.println(countUpperCaseLetters("amazing amazon"));
	}

}
