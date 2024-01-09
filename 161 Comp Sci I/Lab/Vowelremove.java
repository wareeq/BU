public class Vowelremove{
	public static void main(String[] args){
		System.out.println(removeVowels("everlasting"));

	}
	public static boolean isVowel(char c){
		switch(c){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			return true;
		default:
			return false;
		}
	}

	public static String removeVowels(String parameter){
		String remove = "";
		for(int i=0; i < parameter.length();i += 1){
			if ((isVowel(parameter.charAt(i))))
				remove += parameter.charAt(i);
		}
		return remove;
	}
}