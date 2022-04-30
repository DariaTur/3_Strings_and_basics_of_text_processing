package by.epam.training.module3;
/*
 * 5.Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */
public class Task10 {

	public static int countA(String s) {
		int counter = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='a') {
				counter++;
			}
		}
		
		return counter;
	}
	public static void main(String[] args) {
		String s = "Happiness is a butterfly\n"
				+ "Try to catch it like every night\n"
				+ "It escapes from my hands into moonlight";
		System.out.println("Количество буквы “а”: "+countA(s));

	}

}
