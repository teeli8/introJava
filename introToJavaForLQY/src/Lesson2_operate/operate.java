package Lesson2_operate;

public class operate {
	
	public static void main(String[] args) {
		int x = 2;
		int y = 6;
		
		//basic calculations
	    int sum = x + y;
	    int sub = y - x;
	    int product = x * y;
	    int quotient = y / x;
	    int remainder = y % x;
	    System.out.println("sum = " + sum);
	    System.out.println("sub = " + sub);
	    System.out.println("product = " + product);
	    System.out.println("quotient = " + quotient);
	    System.out.println("remainder = " + remainder);
	    
	    //TODO1 : ������֮ǰ���²�ÿ��q���Ƕ���, Ȼ���/**/ȥ����֤��Ĳ���
	    int q1 = 10 / 3;
	    int q2 = 11 / 3;
	    double q3 = (double) 11 / 3;
	/*    System.out.println(q1);
	    System.out.println(q2);
	    System.out.println(q3);  */
	    
	   //����Ϊ0����ô�������Կ���
	   //int problem = 1 / 0;
	    
	    
	    //TODO2 ˼�� �� 1. �߼�Ԥ��Ľ����������ʲô
	    //            2. ���������߼�����Ľ����ʲô
	   /* System.out.println(1 > 2);
	      System.out.println(1 != 0); */
	    
	    
	    boolean isTrue = true;
	    boolean isFalse = false;
	    System.out.println(isTrue && isFalse);
	    System.out.println(isTrue || isFalse);
	    System.out.println(!isTrue);
	}

}
