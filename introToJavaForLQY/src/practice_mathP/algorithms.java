package practice_mathP;

public class algorithms {
	
	//����root��p�η�
	public int power(int root, int p) {
		//TODO
		
		return 0;
	}
	
	
	//����n�Ľ׳�n!
	public int fractorial(int n) {
		//TODO
		
		return n;
	}
	
	//����n��ƽ����������ȡ��
	public int sqrt(int n) {
		//TODO
		
		
		return n;
	}
	
	
	//��������arr��ƽ����
	public int findAverage(int[] arr) {
		int length = arr.length;
		if(length==0) {
			return 0;      //when arr is empty
		}
		//TODO
		
		
		return arr[0];
	}
	
	//��������arr��������
	public int findMax(int[] arr) {
		int length = arr.length;
		if(length==0) {
			return 0;     //when arr is empty
		}
		//TODO
		
		
		return arr[0];
	}
	
	//��������arr�������
	public int findMode(int[] arr) {
		int length = arr.length;
		if(length==0) {
			return 0;    //when arr is empty
		}
		//TODO
		
		
		return 0;
	}
	
	
	
	
	
	
	

/*  my approach:
	int[] a = new int[length];     //�½������¼ÿ���������˶��ٴ�
	for(int i = 0; i < length; ++i) {
		for(int j = i; j < length; ++j) {
			if(arr[i]== arr[j]) {  //��ÿ����������������Ƚ�
				++a[i];            //����г����ظ�����a�Ķ�Ӧλ��+1
			}
		}
	}
	int max = 0;
	for(int m = 1; m < length; ++m) { //�ҳ�a���ĸ������
		if(a[m]>a[m-1]) {
			max = m;
		}
	}
	
	return arr[max];                //����arr���Ӧλ����Ϊ����
*/

}
