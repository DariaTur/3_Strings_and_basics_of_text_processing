package by.epam.training.module3;
/*
 * 2.В строке вставить после каждого символа 'a' символ 'b'.
 */
public class Task7 {
	
	public static StringBuilder addBAfterA(String s) {
		StringBuilder newStr = new StringBuilder("");
		
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i)=='a') {
				newStr.append(s.charAt(i));
				newStr.append('b');
			}else {
				newStr.append(s.charAt(i));
			}
			
		}
		
		return newStr;
	}

	public static void main(String[] args) {
		String s = "abcd ahytf aaa hhfa";
		
		System.out.println(addBAfterA(s));

	}

}
