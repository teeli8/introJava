package practice_lottery;

public class LotteryNumbers {

	public int[] inputNums;         //����ĺ���
	public int[] winningNums;       //�񽱺���
	
	public final int inNum = 5;     //�û���������
	private final int winNum = 30;  //�񽱺������������Ӧ��ʹ������������������ֱ��д5��30��
	                                //�����������Ķ�5��30��ֻ�ø�����������������
    
	public final int range = 100;   //����
	
	//constructor
    public LotteryNumbers() {
    	this.inputNums = new int[inNum];
    	this.winningNums = new int[winNum];
    	//Ϊ�˱���0����Ϊ���ظ��ģ���array�����ȫ����ʼ��Ϊ-1
    	for(int i = 0; i < winNum; ++i) {
    		winningNums[i] = -1;
    		if(i >= inNum) {	
    			continue;
    		}
    		inputNums[i] = -1;
    	}
    	
    }
    
    //���������������Ļ񽱺���
    //����Ҫ��������������notDuplicate()����Ƿ����ظ���
    public void generateWinningNums() {
    	//TODO

    	
    }
    
    
    //��������ж���û���ظ���
    //���target��arr��û�г��ֹ�������true������false
    //ע������arr������Щλ���ǿյ�(Ĭ��Ϊ0)
    public boolean notDuplicate(int[] arr, int target) {
    	//TODO

    	
    	return true;
    }
    
   
    //��������ж��û���û���н�
    //����������������м����ڻ񽱺�����Ҳ������
    //˳������˵ĺ���print����
    public int numOfWin() {
    	int count = 0;
    	//TODO

    	
    	return count;
    }
    
    

}
