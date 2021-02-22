import java.util.*;

class Calculator {
	
	public static void add(int a, int b){
		
		System.out.print(a+b);
	}
	
	public static void sub(int a, int b){
		
		System.out.print(a-b);
	}

	public static void main(String[] args){
	
		Calculator obj = new Calculator();

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		obj.add(a,b);
		sub(a,b);

	}
}