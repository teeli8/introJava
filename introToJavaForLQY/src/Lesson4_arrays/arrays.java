package Lesson4_arrays;

public class arrays {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];  //�������array��ų�������[null][null][null][null][null]
		
		int[] chineseMobile = {1,0,0,8,6}; //[1][0][0][8][6]
		
		//ʵ������arr��Ϊ{1,2,3,4,5}
		for(int index = 0; index < arr.length; index++) { //˼����Ϊʲôѭ��������<5������<=5
			arr[index] = index + 1;
		//	System.out.print(arr[index]+" ");
		}
		
		//TODO: �����������԰�chineseMobile��ÿһλ��ֵ�ֱ𸶸�arr��Ӧ��λ����
		//your code starts here:
		
		
		
		
		//ʵ������for each����
		int[] brr = {5, 2, 1, 2, 1, 2, 4, 1, 9, 9};
		int sum = 0;
		for(int e : brr) {
			sum += e;
		}
		//������δ�������ʲô��
	//	System.out.println(sum);
		
		//��ά����
		int[][] mat = new int[5][5];
		
	/*	for(int r = 0; r < 5; r++) {
			for(int c = 0; c < 5; c++) {
				mat[r][c] = r + c;
				System.out.print(mat[r][c] + " ");
			}
			System.out.println();
		}
     */
		
		
	}

}
