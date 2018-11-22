package practice_mathP;

public class MathPractice {
	
	
	public static void printAns(int correctAns, int yourAns, String algor) {
		System.out.println("Test for " + algor + " :");
		System.out.println("The correct answer is: " + correctAns);
		System.out.println("Your answer is: " + yourAns);
		if(correctAns == yourAns) {
			System.out.println("Your answer is correct!");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Algorithms test = new Algorithms();
		
		int r = 2;
		int p = 5;
		printAns((int)Math.pow(r,p), test.power(r, p), "power()");
		
		int n = 5;
		printAns(120, test.fractorial(n), "fractorial()");
		
		int sq1 = 9;
		int sq2 = 10;
		printAns((int)Math.sqrt(sq1),test.sqrt(sq1),"aqrt()");
		printAns((int)Math.sqrt(sq2),test.sqrt(sq2),"aqrt()");
		
		
		int[] arr1 = {1,2,3,4,5,6,7,8,9};
		printAns(5,test.findAverage(arr1),"findAverage()");
		
		int[] arr2 = {10, 13, 8, 99, 520, 17, 71, 131, 81, 99, 66};
		printAns(520, test.findMax(arr2), "findMax()");
		
		int[] arr3 = {1,1,3,4,5,5,1,3,2,2,6,3,7,4,10,3};
		printAns(3, test.findMode(arr3),"findMode()");
		
		
	}
	

}
