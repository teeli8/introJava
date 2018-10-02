package Lesson3_branchesAndLoops;

public class loops {
	
	public static void main(String[] args) {
		
		
		int count = 0; //我们可以用一个int记录这个loop跑了多少圈
		for(int i = 0; i < 10; i++) {
			count++;  //每进入一次循环，count都会+1
		}
		System.out.println(count);  //循环进行了多少次？
		
		//TODO：用一个for循环由小到大依次print从1到8的整数（包括1和8）
		//如果是由大到小呢？
		//your code starts here:
		
		
		
		
		//思考下面这个while
		int num = 0;
		int sum = 0;
		
		while(num <= 100) {
			sum += num;
			num++;
		}
		
		System.out.println(sum);  //sum在结束循环后是多少呢？是怎么算出来的？
		                          //概括这段代码的功能
		
		
		//TODO：用一个while loop算出等比数列1,2,4,8...1024的和。
		int currentNum = 1;  
		int geoSum = 0;  //答案存这个变量里
		//your code starts here:

		
		
		
		//下面代码可以验证你的答案。祝你好运！
		int correctAnswer = 1+2+4+8+16+32+64+128+256+512+1024;
		if(geoSum == correctAnswer) {
			System.out.println("Yeah! You got it!");
		}
		else {
			System.out.println("No worries! Try again!");
		}
		
		
		
		//扩展
		
		//本来应该跑10次的循环，只跑五次。
	/*	for(int i = 0; i < 10; i++) {
			  System.out.println(i);
			  if(i >= 4) {
				  System.out.println();  //这句是换行的意思
				  break;
			  }
		}
	    */
		
		//把0到10只见所有的基数乘2并print，跳过偶数
	/*	for(int i = 0; i <= 10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			int odd = i * 2;
			System.out.println(odd);
		}
		*/
		
	}
}
