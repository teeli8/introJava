package Lesson5_functions;

public class functions {
	
	/*一般来说，我们习惯把main要用的其他函数写在main上面
	 * 在java里，如果你把它们写在下面，程序依然可以正常运行。
	 * 但是在有些语言里就不行，比如C++
	 * 所以养成写在上面的习惯把！*/
	
	public static int plusTen(int x) {
		return x + 10;
	}
	
	public static void printLove(int times) {
		for(int i = 1; i <= times; i++) {
			System.out.println("I've said I love you " + i + " times!");
		}
	}
	
	
	//TODO1: 定义一个叫takeGreater的函数，使用两个int参数，返还他们中更大的那一个。
	//      如果相等就返还其中一个就行了。
	
	
	
	
	
	
	//Quiz: 如果参数p是质数，函数返还true, 否则返还false。
	//      注意任何小与2的数都不是质数
	public static boolean isPrime(int p) {
		//have fun coding!
		
		
		
		
		return false;
	}
	
	
	
	public static void main(String[] args) {
		
		//实例1：
		int num = 0;
		int added = plusTen(num);   //读到这一行的时候，java会去执行楼上plusTen里的码
		                            //进入函数后，int x的值等于num
		                            //赋值后，added的值为此次调用plusTen返还的值
		System.out.println(added);
		
		//TODO1: 自己试试声明并定义一个函数
	    //自己写一段代码测试一下！
		
		
		
		
		
		//实例2：返还类型为void的函数。
		printLove(added);          //非void返还类型的函数也可以这样直接调用
		
		
		//Quiz:  定义isPrime()函数
		//以下是测试
//		int[] nums = {0,1,2,3,4,5,6,7,8,9,10,-1};
//		for(int i : nums) {
//			if(isPrime(i)) {
//				System.out.print(i + " ");
//			}
//		}
//		System.out.println("The correct output should be 2 3 5 7"); 
		
	}
	

}
