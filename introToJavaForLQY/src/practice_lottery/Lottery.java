package practice_lottery;

import java.util.Scanner;

public class Lottery {
	
	public static final int toWinNum = 3;    //����������������ʤ������Ի��ɱ������
    public static Scanner scan = new Scanner(System.in);  //����Ҫ�õ�Scanner
	
    
    //�ж�һ������target�Ƿ���Ч
    //���ж����Ƿ��ڷ�Χ[0,range)���Լ�����ln��inputNums���Ƿ��Ѿ����ظ�
    public static boolean isIntValid(LotteryNumbers ln, int target, int range){
    	//TODO

    	
    	return true;
    }
    
    
    //printһ�����飬����main����õ�����Ϊ�Ƚϼ����԰���д����
    public static void printNumbers(int[] arr) {
    	for(int i : arr) {
    		System.out.print(i + " ");
    	}
    	System.out.println();
    }
	
	
    
	public static void main(String[] args) {
		
		LotteryNumbers game = new LotteryNumbers();   //����һ��lotteryNumbers
		//TODO�����main
		//�����ϣ����1.��ȡ���� 2.�ж��Ƿ�ɹ���ȡ���� 3.���ɻ񽱺��� 4.�鿴�м������� 4.������
		//��Ӧ��ֱ�ӵ��������lotteryNumbers�﷽�������ǰ����ж�����дһ��
		
        System.out.println("You need to enter " + game.inNum + " numbers of range [0," + game.range + ")");       
    	
        //��ȡ����  
    	//�������Ҫ��һ��loop�ﷴ��ʹ����һ�δ���(try catch)��ֱ���ɹ���ȡ5������
    	//TODO:��ʾ��while loop

            System.out.println("Please enter your next number:");
    		try {   			
    			//TODO����ȡһ�������ж����Ƿ���Ч
        	
        		
    		}
    		catch(java.util.InputMismatchException e) { //������
    			System.out.println("Error! Please enter an integer");
    			scan = new Scanner(System.in);
    		}       

    	//��ȡ��������������񽱺��룬���ж��û��Ƿ��н���
    		
    		
    		
    	//��Ƹ��ݶ�Ӧ������������Ϣ�����磺����������ƥ��0���������You did not win!
    	//�����ϣ�������еĺ��붼print��������ȷ�������ȷ��
    		
    		
        
    		
    	scan.close(); //�ر�scanner
	    System.out.println("Program Over");//�������
	}

}
