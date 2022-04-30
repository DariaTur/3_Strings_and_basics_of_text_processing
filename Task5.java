package by.epam.training.module3;

/*
 * 5.Удалить  в  строке  все  лишние  пробелы,  то  есть  серии  подряд  идущих  пробелов  заменить  на  одиночные  пробелы. 
 *   Крайние пробелы в строке удалить. 
 */
public class Task5 {
	
	public static String deleteRightSpaces(String s) {
		String newStr = "";
		int ind = -1;
		
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(0)!=' ') {
				return s;
			}
			while(s.charAt(i)==' ') {
				i++;
				ind = i;
			}
			if(ind!=-1) {
				newStr += s.substring(ind, s.length()) ;
				break;
			}
			
		}
		return newStr;
	}
	
	public static String deleteLeftSpaces(String s) {
		String newStr = "";
		int ind = -1;
		
		for(int i = s.length()-1; i>0; i--) {
			if(s.charAt(s.length()-1)!=' ') {
				return s;
			}
			while(s.charAt(i)==' ') {
				i--;
				ind = i;
			}
			if(ind!=-1) {
				newStr += s.substring(0, ind+1) ;
				break;
			}
			
		}
		return newStr;
	}

	public static String deleteSpaces(String s) {
		String newStr = "";
		
		for(int i = 0; i<s.length()-1; i++) {
			if(s.charAt(i)!=' ') {
				newStr += s.charAt(i);
			} else {
				if(s.charAt(i+1)!= ' ') {
					newStr += " ";
				}
			}
		}
		
		return newStr;
		
	}
	public static void main(String[] args) {
		String s = "  I don't    like    apples   .  And    also I   don't    like      oranges     .  ";
		s = deleteSpaces(s);
		s = deleteLeftSpaces(s);
		s = deleteRightSpaces(s);
		System.out.println(s);

	}

}
