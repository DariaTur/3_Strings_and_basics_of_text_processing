package by.epam.training.module3;
/*
 * 3.Проверить, является ли заданное слово палиндромом. 
 */
public class Task8 {
	
	public static boolean isPalindrome(String s) {
		boolean check = false;
		
		for(int i = 0,j = s.length()-1; i<s.length()&&j>0; i++,j--) {
			if(s.charAt(i)==s.charAt(j)) {
				check = true;
			}else {
				check = false;
				break;
			}
		}
		return check;
	}
	
	public static void main(String[] args) {
		String[] str = {"шалаш", "mmm" ,"программа"};
		
		for(String s: str) {
			System.out.println(s+" "+isPalindrome(s));
		}
		
	

	}

}
