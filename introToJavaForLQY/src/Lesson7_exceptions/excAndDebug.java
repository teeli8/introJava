package Lesson7_exceptions;

public class ExcAndDebug {
	
	public static final int[] arr = {5,4,3,2,1,0};
	
	
	//this is a bad function
	public static int badSub(int num, int den) {
		return num/den;          //很显然，在den是0的时候，方法就会报错了。
	}
	
	public static int goodSub(int num, int den) {
		if(den == 0) {
			System.out.println("Error at " + num +"/" + den + " ! You cannot divide by 0!");
			return 0;
		}
		return num/den;
	}
	
	
	//试着通过添加print，来找找loop在第几次循环除了问题
	public static int badLoop() {
		int sum = 0;
		for(int i = 0; i <= arr.length; ++i) {
			if(i%2==0) {
				sum += arr[i];
			}
		}
		return sum;
	}
	
	  public static void changeInt(int x) {
		  x = 1;
	  }
	  
	  public static void changeArray(int[] arr) {
		  arr[0] = 1;
	  }
	  
	  public static void changeBox(Box b) {
		  b.setInt(1);
	  }
	  
	
	public static void main(String[] args) {
		
		
		//test badSub
	/*	for(int i : arr) {
			System.out.println(badSub(10,i));
		}
	
	*/	
		//test badLoop
	/*	int result = badLoop();
		System.out.println(result);*/
	
	
		//test try catch
	/*	for(int i : arr) {
			try {
				System.out.println(badSub(10,i));
			}
			catch(java.lang.ArithmeticException e){
				System.out.println("Error! You cannot divide by 0!");
			}
		}
	*/
		
		
		
		//扩展
		int x = 0;
		int[] arr = {0};
		changeInt(x);
		changeArray(arr);
	
		System.out.println("int x after the change is " + x);
		System.out.println("int[] arr after the change is " + arr[0]);
		
//		Box b = new Box(0);
//		changeBox(b);
//		System.out.println("box b after the change is " + b.a);
	}
	

}

class Box{		
	int a;
	Box(int in){
		a = in;
	}
	void setInt(int set) {
		a = set;
	}
}
