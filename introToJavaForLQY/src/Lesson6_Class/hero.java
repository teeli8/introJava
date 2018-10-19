package Lesson6_Class;

public class hero {
	
	//hero类：一个英雄名字，年龄，和个性
	public String name;
	private int age;           
	private quirk quirk;       //英雄不应该轻易暴露年龄和个性，所以我们把它们设成private
	
	//TODO: 完成hero类的构造函数
	
	
	
	
	//这是age的访问器
	//返还这个对象的年龄
	public int getAge() {
		return this.age;
	}
	
	
	//TODO: 完成quirk的访问器
	
	
	
	
	
	
	//这是age的修改器
	//将当前对象的age修改为a
	public void setAge(int a) {
		this.age = a;
	}
	
	
	//TODO: 完成quirk的修改器
	
	
	
	//print英雄信息
	public void showHero() {
		System.out.println(this.name);
		System.out.println("age:" + this.age);
		System.out.println("Quirk: " + this.quirk.qName);
		System.out.println(this.quirk.qDesc);
	}
	
}
