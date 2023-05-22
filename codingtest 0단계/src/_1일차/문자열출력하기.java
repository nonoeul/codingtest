package _1일차;

import java.util.Scanner;

public class 문자열출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a = str.length();
/*
 	next 와 nextline 차이 
 	= 한 줄을 입력하고 싶을 때는 nextline
 	= 한 단어씩 입력하고 싶을때는 next
 */
        
        if(a >= 1 && a <= 1000000) {
            System.out.println(str);
        }
    }
}
