package Lesson5_functions;

public class functions {
	
	/*һ����˵������ϰ�߰�mainҪ�õ���������д��main����
	 * ��java�����������д�����棬������Ȼ�����������С�
	 * ��������Щ������Ͳ��У�����C++
	 * ��������д�������ϰ�߰ѣ�*/
	
	public static int plusTen(int x) {
		return x + 10;
	}
	
	public static void printLove(int times) {
		for(int i = 1; i <= times; i++) {
			System.out.println("I've said I love you " + i + " times!");
		}
	}
	
	
	//TODO1: ����һ����takeGreater�ĺ�����ʹ������int���������������и������һ����
	//      �����Ⱦͷ�������һ�������ˡ�
	
	
	
	
	
	
	//Quiz: �������p����������������true, ���򷵻�false��
	//      ע���κ�С��2��������������
	public static boolean isPrime(int p) {
		//have fun coding!
		
		
		
		
		return false;
	}
	
	
	
	public static void main(String[] args) {
		
		//ʵ��1��
		int num = 0;
		int added = plusTen(num);   //������һ�е�ʱ��java��ȥִ��¥��plusTen�����
		                            //���뺯����int x��ֵ����num
		                            //��ֵ��added��ֵΪ�˴ε���plusTen������ֵ
		System.out.println(added);
		
		//TODO1: �Լ���������������һ������
	    //�Լ�дһ�δ������һ�£�
		
		
		
		
		
		//ʵ��2����������Ϊvoid�ĺ�����
		printLove(added);          //��void�������͵ĺ���Ҳ��������ֱ�ӵ���
		
		
		//Quiz:  ����isPrime()����
		//�����ǲ���
//		int[] nums = {0,1,2,3,4,5,6,7,8,9,10,-1};
//		for(int i : nums) {
//			if(isPrime(i)) {
//				System.out.print(i + " ");
//			}
//		}
//		System.out.println("The correct output should be 2 3 5 7"); 
		
	}
	

}
