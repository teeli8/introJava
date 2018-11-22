package Lesson9_fatherAndSon;

public class rectangle {
	public int length;
	public int width;
	
	//构造函数1
	public rectangle() {
		System.out.println("Rectangle constructor1 called");
		this.length = 5;
		this.width = 5;
	}
	
	//构造函数2
	public rectangle(int l, int w) {
		System.out.println("Rectangle constructor2 called");
		this.length = l;
		this.width = w;
	}
	
	public int area() {
		System.out.println("Rectangle area called");
		return this.length*this.width;
	}
	
	public int perimeter() {
		System.out.println("Rectangle perimeter called");
		return 2*(this.length + this.width);
	}
}
