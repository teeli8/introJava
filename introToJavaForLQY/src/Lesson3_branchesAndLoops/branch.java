package Lesson3_branchesAndLoops;

public class branch {
	
	public static void main(String[] args) {
		
		//ʵ����
		
		boolean loveU = true;
		
		if(loveU) {
			System.out.println("I love U, too!");
		}
		else {
			System.out.println("U liar!");
		}
		
		int x = 0;
		int y = 1;
		
		//TODO: ��if else����жϣ����x��y����ȣ�print x ��  y �и����һ����
		//      �����ȣ�print -1��
		//���Ըı�x��y��ֵ��������Ĵ����Ƿ���ȷ����ÿ��������
		//your code start from here:
		
		
		
		
		
		//��չ�����Ը�z���費ͬ��ֵ������������ĸ��ַ�����
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
