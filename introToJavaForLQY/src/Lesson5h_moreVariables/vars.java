package Lesson5h_moreVariables;

public class vars {

	
	  public static int glob = 1;  //global
	  
	  public static void main(String args[]) {
		  
		  int loc = 2;             //local
		  
		//  System.out.println(glob + loc);
		
		//char居然可以进行加减，神奇吧
		  int sub1 = 'B'-'A';
		  System.out.println("B - A = " + sub1);
		
		//这样会怎么样呢
		  int sub2 = 'C'-'c';
		  System.out.println("C - c = "+ sub2);
		
		//这样？
		  int sum1 = '1'+'1';
		  System.out.println("1 + 1 = "+sum1);
		  
		  String s = "A";
		  String t = "B";
		  System.out.println(s.compareTo(t));
		  
		//  System.out.printf("%d\n", loc);
		  
		  
	  }
	  
}
