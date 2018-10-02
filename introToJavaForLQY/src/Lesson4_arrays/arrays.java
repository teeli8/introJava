package Lesson4_arrays;

public class arrays {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];  //现在这个array大概长这样：[null][null][null][null][null]
		
		int[] chineseMobile = {1,0,0,8,6}; //[1][0][0][8][6]
		
		//实例：让arr变为{1,2,3,4,5}
		for(int index = 0; index < arr.length; index++) { //思考：为什么循环条件是<5而不是<=5
			arr[index] = index + 1;
		//	System.out.print(arr[index]+" ");
		}
		
		//TODO: 现在你来试试把chineseMobile的每一位的值分别付给arr对应的位数。
		//your code starts here:
		
		
		
		
		//实例：用for each访问
		int[] brr = {5, 2, 1, 2, 1, 2, 4, 1, 9, 9};
		int sum = 0;
		for(int e : brr) {
			sum += e;
		}
		//上面这段代码在做什么？
	//	System.out.println(sum);
		
		//二维数组
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
