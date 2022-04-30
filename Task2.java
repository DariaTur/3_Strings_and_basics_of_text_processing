package by.epam.training.module3;
/**
 * Замените в строке все вхождения 'word' на 'letter'.
 */
public class Task2 {
	public static String replace(String str) {
		String newStr = new String("");
		for(int i = 0; i < str.length(); i++) {
			if(i+3<str.length()) {
				if(str.charAt(i)=='w' && str.charAt(i+1)=='o' && str.charAt(i+2)=='r' && str.charAt(i+3)=='d') {
					newStr += "letter";
					i+=3;
				} else {
					newStr += Character.toString(str.charAt(i));
				}
			} 
		}
		if (!newStr.endsWith(str.substring(str.length()-3,str.length()))&&!newStr.endsWith("letter")) {
			newStr+=str.substring(str.length()-3,str.length());
		}		
		return newStr;
	}
	
	public static void main(String[] args) {
		String s = "word kills apple word word word   nn bob punk word letter";
		
		if(!s.isEmpty()) {
			s = replace(s);
			System.out.print(s);
		} else {
			System.out.print("Strinq is empty!");
		}
		
	}

}
