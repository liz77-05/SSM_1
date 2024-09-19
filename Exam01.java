package chapter04;

class People{//父亲
	private String name;
	private int age;
	public void find() {//查看课表方法
		System.out.println("查看课表");
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
		System.out.println("填写听课反馈");
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
