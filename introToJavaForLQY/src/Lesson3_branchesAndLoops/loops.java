package Lesson3_branchesAndLoops;

public class loops {
	
	public static void main(String[] args) {
		
		
		int count = 0; //���ǿ�����һ��int��¼���loop���˶���Ȧ
		for(int i = 0; i < 10; i++) {
			count++;  //ÿ����һ��ѭ����count����+1
		}
		System.out.println(count);  //ѭ�������˶��ٴΣ�
		
		//TODO����һ��forѭ����С��������print��1��8������������1��8��
		//������ɴ�С�أ�
		//your code starts here:
		
		
		
		
		//˼���������while
		int num = 0;
		int sum = 0;
		
		while(num <= 100) {
			sum += num;
			num++;
		}
		
		System.out.println(sum);  //sum�ڽ���ѭ�����Ƕ����أ�����ô������ģ�
		                          //������δ���Ĺ���
		
		
		//TODO����һ��while loop����ȱ�����1,2,4,8...1024�ĺ͡�
		int currentNum = 1;  
		int geoSum = 0;  //�𰸴����������
		//your code starts here:

		
		
		
		//������������֤��Ĵ𰸡�ף����ˣ�
		int correctAnswer = 1+2+4+8+16+32+64+128+256+512+1024;
		if(geoSum == correctAnswer) {
			System.out.println("Yeah! You got it!");
		}
		else {
			System.out.println("No worries! Try again!");
		}
		
		
		
		//��չ
		
		//����Ӧ����10�ε�ѭ����ֻ����Ρ�
	/*	for(int i = 0; i < 10; i++) {
			  System.out.println(i);
			  if(i >= 4) {
				  System.out.println();  //����ǻ��е���˼
				  break;
			  }
		}
	    */
		
		//��0��10ֻ�����еĻ�����2��print������ż��
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
