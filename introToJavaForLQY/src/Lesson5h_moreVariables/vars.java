package Lesson5h_moreVariables;

public class vars {

	
	  public static int glob = 1;  //global
	  
	  public static void main(String args[]) {
		  
		  int loc = 2;             //local
		  
		//  System.out.println(glob + loc);
		
		//char��Ȼ���Խ��мӼ��������
		  int sub1 = 'B'-'A';
		  System.out.println("B - A = " + sub1);
		
		//��������ô����
		  int sub2 = 'C'-'c';
		  System.out.println("C - c = "+ sub2);
		
		//������
		  int sum1 = '1'+'1';
		  System.out.println("1 + 1 = "+sum1);
		  
		  String s = "A";
		  String t = "B";
		  System.out.println(s.compareTo(t));
		  
		//  System.out.printf("%d\n", loc);
		  
		  
	  }
	  
}
