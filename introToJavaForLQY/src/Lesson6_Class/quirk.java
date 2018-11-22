package Lesson6_Class;

public class Quirk {
	
	
	//Quirk类里有两个变量。个性名和个性描述。
	public String qName;
	public String qDesc;
	
	public Quirk() {  //默认构造函数。你写不写都行。
	}

	//this is a constructor 构造函数
	public Quirk(String name, String des) {
		this.qName = name;      
		this.qDesc = des;
	}
	
	
	
}
