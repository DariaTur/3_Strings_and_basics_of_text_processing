package by.epam.training.module3;
/*
 * 6.Из заданной строки получить новую, повторив каждый символ дважды. 
 */
public class Task11 {
	
	public static String repeatEachCharTwice(String s) {
		String newStr = "";
		
		for(int i = 0; i<s.length(); i++) {
			newStr += s.charAt(i);
			newStr += s.charAt(i);
		}
		
		return newStr;
	}
	public static void main(String[] args) {
		String s = "Happiness is a butterfly";
		
		System.out.println(repeatEachCharTwice(s));

	}

}
