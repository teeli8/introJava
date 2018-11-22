package Lesson9_fatherAndSon;

public class square extends rectangle{
	
	public int side;
	
	public square() {
		this.side = super.length;  //使用父类的length
	}
	
	public int area() {
		System.out.println("Sqaure area called");
		return side*side;
	}
	
//	public int perimeter() {
//		System.out.println("Square area called");
//		return 4*side;
//	}
	
	public void expand() {
		this.side*=2;
	}

}
