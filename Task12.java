package by.epam.training.module3;
/*
 * 7.Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено 
 *	 "abc cde def", то должно быть выведено "abcdef". 
 */
public class Task12 {
	
	public static String deleteRepeatingChar(String s) {
		StringBuilder newStr = new StringBuilder("");
		
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i)==' ') {
				continue;
			}
			if(newStr.indexOf(Character.toString(s.charAt(i)))== -1){
				newStr.append(s.charAt(i));
			}
		}
		return newStr.toString();
	}
	
	public static void main(String[] args) {
		String s = "abc cde def cdef nmda";
		
		System.out.print(deleteRepeatingChar(s));

	}

}
