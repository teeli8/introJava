package Lesson6_Class;

public class hero {
	
	//hero�ࣺһ��Ӣ�����֣����䣬�͸���
	public String name;
	private int age;           
	private quirk quirk;       //Ӣ�۲�Ӧ�����ױ�¶����͸��ԣ��������ǰ��������private
	
	//TODO: ���hero��Ĺ��캯��
	
	
	
	
	//����age�ķ�����
	//����������������
	public int getAge() {
		return this.age;
	}
	
	
	//TODO: ���quirk�ķ�����
	
	
	
	
	
	
	//����age���޸���
	//����ǰ�����age�޸�Ϊa
	public void setAge(int a) {
		this.age = a;
	}
	
	
	//TODO: ���quirk���޸���
	
	
	
	//printӢ����Ϣ
	public void showHero() {
		System.out.println(this.name);
		System.out.println("age:" + this.age);
		System.out.println("Quirk: " + this.quirk.qName);
		System.out.println(this.quirk.qDesc);
	}
	
}
