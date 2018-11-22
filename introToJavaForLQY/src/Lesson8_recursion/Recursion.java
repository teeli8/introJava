package Lesson8_recursion;

public class Recursion {
	
	//���n �� 5 С  print n �� 5 ����������
	public static void printNum(int n) {
		if(n < 5) {
			System.out.println(n);
			printNum(n+1);
		}
	}
	
	//�õݹ���׳�n!
	public static int fractorial(int n) {
		if(n <= 0) {
			return 1;
		}
		else return n*fractorial(n-1);       //n! = n*(n-1)!
	}
	
	
	//쳲��������е�x���ֵ
	//x = 0,1,2,3,4,5,6,7...
	//f(x) = 0,1,1,2,3,5,8,13...
	public static int fib(int x) {
		if(x == 0) {
			return 0;             //f(0) = 0
		}
		else if (x == 1) {        //f(1) = 1
			return 1;
		}
		else {
			return (fib(x-1)+fib(x-2));      //otherwise, f(x) = f(x-1) + f(x-2)
		}
	}
	
	
	
	
	public static void main(String[] args) {
		//build your own tests
		System.out.println(fib(6));
	}

	
	
}
