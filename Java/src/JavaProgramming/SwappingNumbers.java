package JavaProgramming;

public class SwappingNumbers {
	public static void main(String[] args) {
		int a= 10 ,b=20;
		
	System.out.println("Before swapping the value of A and B:"+a+"  "+b);
		
		//logic 1
	//int t=a;
	//a=b;
	//b=t;
	//System.out.println("After swapping numbers: +a+ +b");
	
	//logic 2 without using 3rd variable 
	
	//a=a+b;//10+20=30
	//b=a-b;//30-10=20
	//a=a-b;//30-20=10
	//System.out.println("After swapping the value of A and B:"+a+"  "+b);
	
	//logic 3 multiplication and division where a and b should not be zero
	
	//a= a*b; //10*20=200 a=200
	//b=a/b; //200/20 b=10
	//a=a/b; //200/10 a=20
	//System.out.println("After swapping the value of A and B:"+a+"  "+b);
	
	//logic 4 bitwise XOR(^)
	
	b= a+b-(a=b);
	
	System.out.println("After swapping the value of A and B:"+a+"  "+b);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
