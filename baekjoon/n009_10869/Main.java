package n009_10869;

import java.util.*;
public class Main{
	public static void main(String args[]){
	
	//두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 	
		
	Scanner scan = new Scanner(System.in);
	int a, b;
	a = scan.nextInt();
	b = scan.nextInt();
	
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	System.out.println(a%b);
	
	}
}