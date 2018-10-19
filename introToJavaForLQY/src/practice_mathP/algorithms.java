package practice_mathP;

public class algorithms {
	
	//返还root的p次方
	public int power(int root, int p) {
		//TODO
		
		return 0;
	}
	
	
	//返还n的阶乘n!
	public int fractorial(int n) {
		//TODO
		
		return n;
	}
	
	//返还n的平方根，向下取整
	public int sqrt(int n) {
		//TODO
		
		
		return n;
	}
	
	
	//返还数组arr的平均数
	public int findAverage(int[] arr) {
		int length = arr.length;
		if(length==0) {
			return 0;      //when arr is empty
		}
		//TODO
		
		
		return arr[0];
	}
	
	//返还数组arr里最大的数
	public int findMax(int[] arr) {
		int length = arr.length;
		if(length==0) {
			return 0;     //when arr is empty
		}
		//TODO
		
		
		return arr[0];
	}
	
	//返还数组arr里的众数
	public int findMode(int[] arr) {
		int length = arr.length;
		if(length==0) {
			return 0;    //when arr is empty
		}
		//TODO
		
		
		return 0;
	}
	
	
	
	
	
	
	

/*  my approach:
	int[] a = new int[length];     //新建数组记录每个数出现了多少次
	for(int i = 0; i < length; ++i) {
		for(int j = i; j < length; ++j) {
			if(arr[i]== arr[j]) {  //把每个数和它后面的数比较
				++a[i];            //如果有出现重复，就a的对应位里+1
			}
		}
	}
	int max = 0;
	for(int m = 1; m < length; ++m) { //找出a里哪个数最大
		if(a[m]>a[m-1]) {
			max = m;
		}
	}
	
	return arr[max];                //返还arr里对应位数即为众数
*/

}
