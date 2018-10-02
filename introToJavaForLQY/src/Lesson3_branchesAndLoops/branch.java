package Lesson3_branchesAndLoops;

public class branch {
	
	public static void main(String[] args) {
		
		//实例：
		
		boolean loveU = true;
		
		if(loveU) {
			System.out.println("I love U, too!");
		}
		else {
			System.out.println("U liar!");
		}
		
		int x = 0;
		int y = 1;
		
		//TODO: 用if else语句判断，如果x与y不相等，print x 与  y 中更大的一个；
		//      如果相等，print -1。
		//尝试改变x与y的值，看看你的代码是否正确处理每种条件！
		//your code start from here:
		
		
		
		
		
		//扩展：尝试给z赋予不同的值，打出来的是哪个字符串？
		int z = 0;
		switch(z) {
		    case 0 :
			   System.out.println("Wow"); 
			   break;
		    case 1 :
				System.out.println("How"); 
				break;
		    case 2 :
				System.out.println("Amazing"); 
				break;
		    case 3 :
				System.out.println("This"); 
				break;
		    case 4 :
				System.out.println("Thing"); 
				break;
		    case 5 :
				System.out.println("Is"); 
				break;
		    default:
		    	System.out.println("z does not belong to any of the conditions");
		    	break;
		}
		
	}

}
