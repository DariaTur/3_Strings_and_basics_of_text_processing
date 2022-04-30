package by.epam.training.module3;
/*
 * 4.В строке найти количество чисел.
 */
public class Task4 {
	
	public static int countNumbers(String str) {
		int counter = 0;
		for(int i = 0 ; i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				while(Character.isDigit(str.charAt(i))&&i<str.length()-1) {
					i++;
					
				}
				counter++;
			}

		}
		
		return counter;
	}
	
	public static void main(String[] args) {
		String s = "19jd hdbt561 8282 1cvv 67 fjgfjg 675 n83";
		
		System.out.println("Количество чисел в строке: "+countNumbers(s));
	}

}
