/*结合包lessons的StudentABC.java，学习private、protected。
https://blog.csdn.net/u011541946/article/details/73215841
 */
package lessons;

public class MyClassStudentABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentABC Anthony =new StudentABC();
		Anthony.name="Anthony";
		Anthony.age=18;
		
		System.out.println(Anthony.name);
		System.out.println(Anthony.age);
		/*
		 * 下面是StudentABC使用private 修饰
		
		Anthony.setName("Anthony");
		Anthony.setAge(18);
		System.out.println(Anthony.getName());
		System.out.println(Anthony.getAge());
		 */
	}

}
