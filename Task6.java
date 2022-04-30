package by.epam.training.module3;
/*
 * 1.Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем. 
 */

public class Task6 {
	
	public static int findMaxCount(String s) {
		int counter = 0;
		int max = 0;
		
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i)==' ') {
				counter ++;
			} else {
				if(max<counter) {
					max = counter;
				}
				counter = 0;
			}
		}
		
		if(max<counter) {
			max = counter;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		String s = "     19jd hdbt561   8282   1cvv         ";
		
		System.out.println("Наибольшее кол-во подряд идущих пробелов: "+findMaxCount(s));

	}
}
