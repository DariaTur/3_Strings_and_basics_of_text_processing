package by.epam.training.module3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее 
 * выполнять с текстом три различных операции: 
 * 
 * - отсортировать абзацы по количеству предложений; 
 * - в каждом предложении отсортировать слова по длине;
 * - отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.
 * 
 */

public class Task16 {
	
	public static String sortParagraphs(String text) {
		String[] str = text.split("\n");
		String result = "";
		String REGEX = "[.|?|!]";
		boolean p = true;

		while(p) {
			p = false;
			for(int i = 0; i<str.length-1; i++) {
				if(str[i].split(REGEX).length > str[i+1].split(REGEX).length) {
					String temp = str[i];
					str[i] = str[i+1];
					str[i+1] = temp;
					p = true;
					
				}
			}
		}
		for(int i = 0; i<str.length-1; i++) {
			result+=str[i]+" \n";
		}
		
		result+=str[str.length-1];

		return result;
		
	}
	
	public static String sortSentences(String text) {
		String[] str = text.split("\n");
		String result = "" ;
		String REGEX = "[.!?…]";
		boolean p = true;
		
		for(int i = 0; i<str.length; i++) {
				String[] sents = str[i].split(REGEX);
				for(int j = 0; j<sents.length; j++) {
					String[] words = sents[j].split(" ");
					while(p) {
						p = false;
						for(int k = 0; k<words.length-1; k++) {
							if((words[k].length()-1!=-1) && (words[k].charAt(words[k].length()-1)==',' 
									|| words[k].charAt(words[k].length()-1)==':'
									||words[k].charAt(words[k].length()-1)==';')) {
								if(words[k].length()-1>words[k+1].length()) {
									String temp = words[k];
									words[k] = words[k+1];
									words[k+1] = temp;
									p = true;
								}
							}
							else if(words[k+1].length()-1 != -1 && (words[k+1].charAt(words[k+1].length()-1)==',' 
									|| words[k+1].charAt(words[k+1].length()-1)==':'
									||words[k+1].charAt(words[k+1].length()-1)==';')) {
								if(words[k].length()>words[k+1].length()-1) {
									String temp = words[k];
									words[k] = words[k+1];
									words[k+1] = temp;
									p = true;
								}
							}
							else {
								if(words[k].length()>words[k+1].length()) {
									String temp = words[k];
									words[k] = words[k+1];
									words[k+1] = temp;
									p = true;
								}
							}		
						}
					}
					p = true;
					result += String.join(" ",words)+". ";
					sents[j] = result;
					str[i] = sents[j];
				}
				result = "";
			}
		return String.join("\n", str);
					
	}	
		
	public static String sortLexeme(String text, char ch) {
		String[] str = text.split("\n");
		String result = "" ;
		String REGEX = "[.!?…]";
		boolean p = true;
		
		for(int i = 0; i<str.length; i++) {
				String[] sents = str[i].split(REGEX);
				for(int j = 0; j<sents.length; j++) {
					String[] words = sents[j].split(" ");
//					System.out.println(Arrays.toString(words));	
					while(p) {
						p = false;
						for(int k = 0; k<words.length-1; k++) {
							if(count(words[k],ch)<count(words[k+1],ch)) {
								String temp = words[k];
								words[k] = words[k+1];
								words[k+1] = temp;
								p = true;
							} else if(count(words[k],ch)==count(words[k+1],ch)) {
								if(words[k].length()!=0&&(int)(Character.toLowerCase(words[k].charAt(0))) > (int)(Character.toLowerCase(words[k+1].charAt(0)))) {
									String temp = words[k];
									words[k] = words[k+1];
									words[k+1] = temp;
									p = true;
								}
							}
						}
					}
					p = true;
					result += String.join(" ",words)+". ";
					sents[j] = result;
					str[i] = sents[j];
				}
				result = "";
			}
		return String.join("\n", str);
	}
 	
	public static int count(String word, char ch) {
		int count = 0;
		
		for(int i = 0; i<word.length(); i++) {
			if(Character.toLowerCase(word.charAt(i))==ch) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. At varius vel pharetra vel turpis nunc. Praesent tristique magna sit amet." //3
				+ "\n"
				+ "Mauris a diam maecenas sed enim ut sem viverra. Odio eu feugiat pretium nibh ipsum. Ac ut consequat semper viverra. Aenean vel elit scelerisque mauris pellentesque pulvinar pellentesque. Eu turpis egestas pretium aenean." //5
				+ "\n"
				+ "Dui faucibus in ornare quam viverra orci. Non diam phasellus vestibulum lorem sed. Nisl vel pretium lectus quam id leo in. Ante in nibh mauris cursus mattis. Lacus luctus accumsan tortor posuere ac ut consequat semper." //5
				+  "\n"
				+ "Amet purus gravida quis blandit turpis cursus. Posuere urna nec tincidunt praesent semper feugiat nibh. Neque gravida in fermentum et sollicitudin ac orci. Orci porta non pulvinar neque laoreet suspendisse." //4
				+ "\n"
				+ "Dictum at tempor commodo ullamcorper a lacus. Senectus et netus et malesuada fames ac turpis egestas. Diam quis enim lobortis scelerisque fermentum dui faucibus. Non quam lacus suspendisse faucibus interdum posuere lorem ipsum dolor."; //4
		Scanner sc = new Scanner(System.in);
		int n ;
		
		System.out.println("1. Отсортировать абзацы по количеству предложений; "
						+"\n2. В каждом предложении отсортировать слова по длине;"
						+"\n3. Отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.");
		System.out.println("Введите число от 1 до 3: ");
		
		while(!sc.hasNextInt()) {
			sc.nextLine();
		}
		
		n = sc.nextInt();
		
		switch(n) {
			case 1: text = sortParagraphs(text);
				System.out.print(text);
				break;
			case 2: text = sortSentences(text);
				System.out.print(text);
				break;
			case 3: text = sortLexeme(text,'a');
				System.out.print(text);
				break;	
			default: System.out.println("Введено неверное число.");
		}
	
	}

}
