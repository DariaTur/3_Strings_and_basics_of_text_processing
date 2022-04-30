package by.epam.training.module3;
/*
 * 8.Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
 *	 Случай, когда самых длинных слов может быть несколько, не обрабатывать. 
 */
public class Task13 {
	
	public static String findLongestWord(String text) {
		String word = "";
		String[] words = text.split(" ");
		
		for(int i = 0; i<words.length; i++) {
			if(word.length()<words[i].length()) {
				word = words[i];
			}
		}
		return word;
	}

	public static void main(String[] args) {
		String s = "Happiness  is a butterfly";
		
		System.out.print(findLongestWord(s));

	}

}
