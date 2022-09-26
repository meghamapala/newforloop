package newforloopdemo;

public class DemoForLoop {

	public static void main(String[] args) {
		
		int i ;
		int b = 30;
		int c = 500;
		
		String EnglishAlphebat[]= {"A,B,C,D,Z"};
		
		
		for(i=10; i<=20; i++) {
			System.out.println(i);
		}
		
		while(b<=40) {
			System.out.println(b);
			b++;
		}
		
		do {
			System.out.println(c);
			c++;
		}while(c<=505);
		
		for(String writing : EnglishAlphebat) {
			System.out.println(writing);
		}

	}

}
