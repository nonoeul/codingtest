package _2일차;

class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
  
        
        for (int i = 0; i < str1.length(); i++) 
        {
			answer += str1.substring(i,i+1);
			answer += str2.substring(i,i+1);
		}
        return answer;
    }
}

public class 문자열섞기 {
	public static void main(String[] args) {
		
		String st1="hello";
		String st2="noeul";
		String happy="";
		
		for (int i = 0; i < st1.length(); i++)
		{
			happy+=st1.substring(i,i+1);
			happy+=st2.substring(i,i+1);
		}
		
		System.out.println(happy);
	}
}
