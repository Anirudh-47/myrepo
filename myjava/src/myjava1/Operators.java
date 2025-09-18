package myjava1;

public class Operators {

	public static void main(String[] args) {
		// ARTHMETIC OPERATOR
		int a = 3;
		int b = 5;
		System.out.println("The addition of a+b="+ (a + b));
		System.out.println("The substraction of a-b="+ (a - b));
		System.out.println("The multiplication of a*b="+ (a * b));
		System.out.println("The division of a/b="+ (a / b));
		System.out.println("The modular of a%b="+ (a % b));
		
		// UNARY OPERATOR
		System.out.println("preincrement:"+ (++a));
		System.out.println("postincrement"+ (a++));
		System.out.println("postdecrement"+ (--b));
		System.out.println("postdecrement"+ (b--));
		
		
		//ASSIGNMENT OPERATOR
		System.out.println("a+=b"+ (a += b));
		System.out.println("a-=b"+ (a -= b));
		System.out.println("a*=b"+ (a *= b));
		System.out.println("a/=b"+ (a /= b));
		System.out.println("a%=b"+ (a %= b));
		
		//RELATIONAL OPERATOR
		System.out.println("a > b="+ (a > b));
		System.out.println("a < b="+ (a < b));
		System.out.println("a >= b="+ (a >= b));
		System.out.println("a <= b="+ (a <= b));
		System.out.println("a == b="+ (a == b));
		System.out.println("a != b="+ (a != b));
		
		
		
	}

}
