package by.epam.training.module3;
/*
 * 4.С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */
public class Task9 {
	
	public static String createWord(String s) {
		String newStr = "";
		newStr += s.charAt(s.indexOf('т'));
		newStr += s.charAt(s.indexOf('о'));
		newStr += s.charAt(s.indexOf('р'));
		newStr += s.charAt(s.indexOf('т'));
		return newStr;
	}

	public static void main(String[] args) {
		System.out.println(createWord("информатика"));
	}

}
