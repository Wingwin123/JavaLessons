//结合包lessons的Student.java学习类和方法
//https://blog.csdn.net/u011541946/article/details/73009727
package lessons;

public class MyClassStudent {

	public static void main(String[] args) {
		Student Anthony = new Student();//Anthony 是一个对象 或者实例
		
		Anthony.setId(1);
		Anthony.setName("Anthony");
		Anthony.setAge(18);
		
		System.out.println(Anthony.name+"is "+Anthony.age+" years old.");
	}

}
