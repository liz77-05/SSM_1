package chapter04;

class People{//����
	private String name;
	private int age;
	public void find() {//�鿴�α���
		System.out.println("�鿴�α�");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
class Student extends People{
	private String className;
	public void write() {
		System.out.println("��д���η���");
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
}
public class Exam01 {
	public static void main(String[] args){
		
	}

}
