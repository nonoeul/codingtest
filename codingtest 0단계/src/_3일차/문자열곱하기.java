package _3일차;


public class 문자열곱하기 {
	public static void main(String[] args) {
		
	String a="string";
	int b=3;
	String answer="";
	
	for (int i = 0; i < b; i++) 
	{
		answer+=a;
	}
		System.out.println(answer);
		
		System.out.println(answer.repeat(b));
	}
}



/*
 	repeat 
 	public String repeat(int count)
 	지정된 횟수만큼 반복한다.
 	
*/