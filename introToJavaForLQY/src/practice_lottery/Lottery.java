package practice_lottery;

import java.util.Scanner;

public class Lottery {
	
	public static final int toWinNum = 3;    //我们现在是三个获胜，你可以换成别的数。
    public static Scanner scan = new Scanner(System.in);  //我们要用的Scanner
	
    
    //判断一个输入target是否有效
    //即判断其是否在范围[0,range)内以及其在ln的inputNums里是否已经有重复
    public static boolean isIntValid(LotteryNumbers ln, int target, int range){
    	//TODO

    	
    	return true;
    }
    
    
    //print一个数组，你在main里会用到。因为比较简单所以帮你写好了
    public static void printNumbers(int[] arr) {
    	for(int i : arr) {
    		System.out.print(i + " ");
    	}
    	System.out.println();
    }
	
	
    
	public static void main(String[] args) {
		
		LotteryNumbers game = new LotteryNumbers();   //构造一个lotteryNumbers
		//TODO：完成main
		//你可能希望：1.读取输入 2.判断是否成功读取输入 3.生成获奖号码 4.查看有几个符合 4.输出结果
		//你应该直接调用上面和lotteryNumbers里方法而不是把所有东西重写一遍
		
        System.out.println("You need to enter " + game.inNum + " numbers of range [0," + game.range + ")");       
    	
        //读取输入  
    	//你或许需要在一个loop里反复使用这一段代码(try catch)，直到成功获取5个输入
    	//TODO:提示：while loop

            System.out.println("Please enter your next number:");
    		try {   			
    			//TODO：读取一个数并判断其是否有效
        	
        		
    		}
    		catch(java.util.InputMismatchException e) { //别改这段
    			System.out.println("Error! Please enter an integer");
    			scan = new Scanner(System.in);
    		}       

    	//读取结束后，生成随机获奖号码，并判断用户是否中奖。
    		
    		
    		
    	//设计根据对应结果而输出的信息，比如：如果输入号码匹配0个，输出：You did not win!
    	//你可能希望把所有的号码都print出来，以确保结果正确。
    		
    		
        
    		
    	scan.close(); //关闭scanner
	    System.out.println("Program Over");//程序结束
	}

}
