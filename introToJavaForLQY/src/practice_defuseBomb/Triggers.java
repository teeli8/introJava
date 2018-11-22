package practice_defuseBomb;

public class Triggers {

	private Bomb bomb;          //don't let it explode!
	private int[] inputNums;    //this array stores your inputs (if they are int)
	
	
	public Triggers() {
		this.bomb = new Bomb();
		this.inputNums = new int[6];
	}
	
	
	public int trigger1(String str) {
		if(str.compareTo("Love")>0 
				&& str.compareTo("Lqy")<0) {
			return 0;
		}
		this.bomb.explode();
		return -1;
	}
	
	
	public int trigger2(String str) {
		if(this.getTwoInt(str) == false) {
			this.bomb.explode();
			return -1;
		}
		int int1 = this.inputNums[0];
		int int2 = this.inputNums[1];
		if(int1 < 2 || int2 < 2 || int2<=int1) {
			this.bomb.explode();
			return -1;
		}
		if(int2 % int1 != 0) {
			this.bomb.explode();
			return -1;
		}
		return 0;
	}
	
	public int trigger3(String str) {
		if(this.getSixInt(str) == false) {
			this.bomb.explode();
			return -1;
		}
		if(this.inputNums[0] <= 0) {
			this.bomb.explode();
			return -1;
		}
		
		for(int i = 1; i < 6; i++) {
			if(this.inputNums[i-1]*2 != this.inputNums[i]) {
				this.bomb.explode();
				return -1;
			}
		}
		return 0;
	}
	
	public int trigger4(String str) {
		if(this.getTwoInt(str) == false) {
			this.bomb.explode();
			return -1;
		}
		int x = this.inputNums[0];
		int y = this.inputNums[1];
		
		swap(x,y);
		
		if(x <= y) {
			this.bomb.explode();
			return -1;
		}
		return 0;
		
	}
	
	public int trigger5(String str) {
		if(this.getTwoInt(str) == false) {
			this.bomb.explode();
			return -1;
		}
		int x = this.inputNums[0];
		int y = this.inputNums[1];
		
		if(x<=5) {
			this.bomb.explode();
			return -1;
		}
        int ans = this.rec(x);
		if(ans!=y) {
			this.bomb.explode();
			return -1;
		}
		return 0;
	}
	
	public int trigger6(String str) {
		int num = (int)(Math.random()*20)+10;
		int fmid = fib(num);
		int flast = fib(num-1);
		int fnext = fib(num+1);
		int result = fmid*fmid - flast*fnext;
		if(result<0) {
			result = -result;
		}
		String ans = this.getAns(result);
		if(str.equals(ans)) {
			return 0;
		}
		this.bomb.explode();
		return -1;
	}
	
	
	private int rec(int x) {
		if((x >= 0) && (x <= 2)) {
			return 1;
		}
		else if(x%2==0) {
			return rec(x-1)+rec(x-2);
		}
		else {
			return rec(x-3)*rec(x-2)+rec(x-1);
		}
	}
	

	
	private String getAns(int i) {
		String retAns = "lqy is ";
		switch(i) {	     
		     case 0:
			     retAns += "pretty";
			     break;    
		     case 1:
		    	 retAns += "smart";
		         break;     
		     case 2:
		    	 retAns += "strong";
		         break;	     
		     case 3:
		    	 retAns += "funny";
		         break; 
		     case 4:
		    	 retAns += "kind";
		    	 break;  
		     case 5:
		    	 retAns += "talented";
		    	 break;  	 
		     case 6:
		    	 retAns += "polite";
		    	 break; 
		     case 7:
		    	 retAns += "sweet";
		    	 break;	 
		     default:
		    	 retAns = "The answer is one of the above trust me";
		    	 break;
		}
		return retAns;
	}
	
	
	private boolean getTwoInt(String str) {
		int indexOfSpace = str.indexOf(' ');
		
		if(indexOfSpace <= 0 || indexOfSpace >= str.length()-1) {
			return false;
		}
		
		int lastIndexOfSpace = str.lastIndexOf(' ');
		if(indexOfSpace != lastIndexOfSpace) {
			return false;
		}
		try {
			this.inputNums[0] = Integer.parseInt(str.substring(0,indexOfSpace));
			this.inputNums[1] = Integer.parseInt(str.substring(indexOfSpace+1));
		}catch(java.lang.NumberFormatException e) {
			return false;
		}
		
		return true;
		
	}
	
	private boolean getSixInt(String str) {
		int index;
		String temp = str;
		for(int i = 0; i < 6; i++) {
			 if(i==5) {
				 try {
					 this.inputNums[i] = Integer.parseInt(temp);
				 }catch(java.lang.NumberFormatException e) {
					 return false;
				 }
				 return true; 
			 }
			 index = temp.indexOf(' ');
			 if(index<=0 || index>=temp.length()-1) {
				 return false;
			 }
			 else {
				 try {
					 this.inputNums[i] = Integer.parseInt(temp.substring(0,index));
				 }catch(java.lang.NumberFormatException e) {
					 return false;
				 }
				 temp = temp.substring(index+1);
			 }
		}
		return true;
	}
	
	//trying to swap the value of two integers
	private static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}
	
    //the nth number in a Fibonacci's series starting with 0 and 1
	private static int fib(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}
	
	
	
	
}
