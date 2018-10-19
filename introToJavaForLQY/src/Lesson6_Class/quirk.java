package Lesson6_Class;

public class quirk {
	
	
	//quirk类里有两个变量。个性名和个性描述。
	public String qName;
	public String qDesc;
	
	public quirk() {  //默认构造函数。你写不写都行。
	}

	//this is a constructor 构造函数
	public quirk(String name, String des) {
		this.qName = name;      
		this.qDesc = des;
	}
	
	
	
}
