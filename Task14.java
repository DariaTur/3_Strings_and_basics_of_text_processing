package by.epam.training.module3;

//Посчитать количество строчных (маленьких) и прописных (больших) букв во введенной строке. Учитывать только английские буквы.

public class Task14 {
	
	public static int countLowercase(String s) {
		int counter = 0;
		
		for(int i = 0; i<s.length(); i++) {
			if(Character.isLowerCase(s.charAt(i))) {
				counter++;
			}
		}
		
		return counter;
	}
	
	public static int countUppercase(String s) {
		int counter = 0;
		
		for(int i = 0; i<s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				counter++;
			}
		}
		
		return counter;
	}

	public static void main(String[] args) {
		String s = "Happiness  Is A Butterfly";
		
		System.out.println("Кол-во строчных букв: "+countLowercase(s));
		System.out.print("Кол-во прописных букв: "+countUppercase(s));

	}

}
