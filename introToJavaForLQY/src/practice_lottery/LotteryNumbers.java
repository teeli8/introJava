package practice_lottery;

public class LotteryNumbers {

	public int[] inputNums;         //输入的号码
	public int[] winningNums;       //获奖号码
	
	public final int inNum = 5;     //用户输入数量
	private final int winNum = 30;  //获奖号码的数量。你应该使用这两个变量而不是直接写5和30。
	                                //这样如果你想改动5和30，只用改这两个变量就行了
    
	public final int range = 100;   //上限
	
	//constructor
    public LotteryNumbers() {
    	this.inputNums = new int[inNum];
    	this.winningNums = new int[winNum];
    	//为了避免0被认为是重复的，把array里的数全部初始化为-1
    	for(int i = 0; i < winNum; ++i) {
    		winningNums[i] = -1;
    		if(i >= inNum) {	
    			continue;
    		}
    		inputNums[i] = -1;
    	}
    	
    }
    
    //这个方法生成随机的获奖号码
    //你需要在这个方法里调用notDuplicate()检查是否有重复。
    public void generateWinningNums() {
    	//TODO

    	
    }
    
    
    //这个方法判断有没有重复。
    //如果target在arr里没有出现过，返还true，否则false
    //注意这里arr可能有些位置是空的(默认为0)
    public boolean notDuplicate(int[] arr, int target) {
    	//TODO

    	
    	return true;
    }
    
   
    //这个方法判断用户有没有中奖
    //即返还输入号码里有几个在获奖号码里也出现了
    //顺便把中了的号码print出来
    public int numOfWin() {
    	int count = 0;
    	//TODO

    	
    	return count;
    }
    
    

}
