package by.epam.training.module3;
/*
 * 3.В строке найти количество цифр.
 */
public class Task3 {
	
	public static int countNumbers(String str) {
		int counter = 0;
		for(int i = 0 ; i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				counter++;
			}
		}
		
		return counter;
	}

	public static void main(String[] args) {
		String s = "19jd hdbt561 8282 1cvv";
		
		System.out.println("Количество цифр в строке: "+countNumbers(s));

	}

}
