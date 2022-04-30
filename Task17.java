package by.epam.training.module3;

import java.util.regex.*;

/*
 * 2.Дана строка, содержащая следующий текст (xml-документ):
 *   <notes>
 *      <note id = "1">
 *         <to>Вася</to>
 *         <from>Света</from>
 *         <heading>Напоминание</heading>
 *         <body>Позвони мне завтра!</body>
 *      </note>
 *      <note id = "2">
 *          <to>Петя</to>
 *          <from>Маша</from>
 *          <heading>Важное напоминание</heading>
 *          <body/>
 *      </note>
 *   </notes>
 *   Напишите анализатор, позволяющий последовательно возвращать содержимое узлов
 *   xml-документа и его тип (открывающий тег, закрывающий тег, содержимое тега,
 *   тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
 */

public class Task17 {
	
	public static void xmlParser(String text) {
		String openingTeg = "<[^<>/]+>";
		String closingTeg = "</[^<>]+>";
		String emptyTeg = "<\\w.+?/>";
		String content = ">\\S.+?<";
		String[] xml = text.split("\n\\s*");
		Pattern pattern1 = Pattern.compile(openingTeg);
		Pattern pattern2 = Pattern.compile(closingTeg);
		Pattern pattern3 = Pattern.compile(emptyTeg);
		Pattern pattern4 = Pattern.compile(content);
		
		for(String s : xml) {
			Matcher matcher1 = pattern1.matcher(s);
			Matcher matcher2 = pattern2.matcher(s);
			Matcher matcher3 = pattern3.matcher(s);
			Matcher matcher4 = pattern4.matcher(s);
			
			if(matcher1.find()) {
				System.out.println(matcher1.group()+" - открывающий тег");
			} 
			if(matcher4.find()){
				System.out.println(matcher4.group().substring(1,matcher4.group().length()-1)+" - содержимое");
			} 
			if(matcher2.find()) {
				System.out.println(matcher2.group()+" - закрывающий тег");
			}
			if(matcher3.find()) {
				System.out.println(matcher3.group()+" - пустой тег");
			}
			
		}	
	}

	public static void main(String[] args) {
		String text = "<notes>\n"
				+ "       <note id = \"1\">\n"
				+ "         <to>Вася</to>\n"
				+ "          <from>Света</from>\n"
				+ "          <heading>Напоминание</heading>\n"
				+ "          <body>Позвони мне завтра!</body>\n"
				+ "       </note>\n"
				+ "       <note id = \"2\">\n"
				+ "           <to>Петя</to>\n"
				+ "           <from>Маша</from>\n"
				+ "           <heading>Важное напоминание</heading>\n"
				+ "           <body/>\n"
				+ "       </note>\n"
				+ "    </notes>";
		
		xmlParser(text);

	}

}
