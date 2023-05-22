package _1일차;

import java.util.Scanner;

/*
자바에서 Character은 '문자(Character)를 나타내는데 사용되는 클래스
Character 클래스는 다양한 연산과 숙성을 제공 
1. isLetter(char ch): 주어진 문자가 알파벳 문자인지 확인합니다.
2. isDigit(char ch): 주어진 문자가 숫자인지 확인합니다. 
3. isWhitespace(char ch): 주어진 문자가 공백 문자인지 확인합니다.
4. toUpperCase(char ch): 주어진 문자를 대문자로 변환합니다. to는 향하다 대문자로 향하다 대문자변환
5. toLowerCase(char ch): 주어진 문자를 소문자로 변환합니다.
6. isUpperCase(char ch): 주어진 문자가 대문자인지 확인합니다. is는 같다 = 동일하지만 확인
7. isLowerCase(char ch): 주어진 문자가 소문자인지 확인합니다
8. toString(char ch): 주어진 문자를 문자열로 변환합니다.
 */


public class 대소문자바꿔서출력하기 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String a = sc.next();
	        
//	        for (int i = 0; i < a.length(); i++) 
//	        {
//	        	char c=a.charAt(i);
//				if(Character.isUpperCase(c))
//				{
//					result += Character.toLowerCase(c);
//				}else {
//					result += Character.toUpperCase(c);
//				}
//			}
//	        System.out.println(result);
	        
	        for (int i = 0; i < a.length(); i++) 
	        {
				char c=a.charAt(i);
				if(Character.isUpperCase(c))
				{
					System.out.print((char)(c+32));
				} else
					System.out.print((char)(c-32));
			}
	    }	
	}































