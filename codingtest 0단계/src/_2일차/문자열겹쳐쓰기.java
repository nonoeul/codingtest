package _2일차;

class Solution {
    public String solution(String my_string, String overwrite_string, int s) 
    {
      String answer = ""; 
      String first = my_string.substring(0,s);
      String middle = overwrite_string;
      String end = my_string.substring(s+overwrite_string.length());
          
        
        return first+middle+end;    }
}

public class 문자열겹쳐쓰기 {
	public static void main(String[] args) {
		
	/*
	substring : 일부분을 추출하는데 사용되는 메소드 
				자바에서 원하는 위치의 문자열 부분을 선택해서 반환 가능 
	
	1. startIndex : 추출을 시작할문자의 인덱스 값, 인덱스 0번 부터 시작
	-- 시작부터~종료까지
	2. endindex : 추출을 종료할 문자 바로 다음 위치의 인덱스 
	-- 시작부터~종료전까지
	
	String substring(int startIndex)
	String substring(int startIndex, int endIndex)
	 */
		String str="Hello, World!";
		
		String sub1=str.substring(7);
		String sub2=str.substring(0, 5);
		String sub3=str.substring(7, 12);
		
		
		System.out.println(sub1);
		System.out.println(sub2);
		System.out.println(sub3);
	}
}

