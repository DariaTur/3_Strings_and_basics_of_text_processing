package by.epam.training.module3;

import java.util.Arrays;

/*
 * 1.Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */

public class Task1 {
	public static String[] rename(String[] camel) {
		String[] snake = new String[camel.length];
		int i = 0;
		
		for (String word: camel) {
			snake[i] = "";
			for(int j = 0; j<word.length(); j++) {
				if(word.charAt(j) == Character.toUpperCase(word.charAt(j))) {
					snake[i] += "_"+Character.toString(word.charAt(j));
				} else{
					snake[i] += Character.toString(word.charAt(j));
				}
			}
			snake[i] = snake[i].toLowerCase();
			i++;	
		}
		return snake;
	}

	public static void main(String[] args) {
		String[] camel= {"camelCase", "doTask", "findElem" ,"createMatrix", "camelWithHeadUp"} ;
		
		System.out.print(Arrays.toString(rename(camel)));
	}

}
