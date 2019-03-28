/*结合包lessons的AllStudents.java，学习static举例。
 * https://blog.csdn.net/u011541946/article/details/73188919
 */
package lessons;

public class MyClassAllStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllStudents Anthony = new AllStudents();
		System.out.println(Anthony.getNoOfStudents());
		
		AllStudents Tom = new AllStudents();
		System.out.println(Tom.getNoOfStudents());
		
		AllStudents Jack = new AllStudents();
		System.out.println(Jack.getNoOfStudents());
		
		System.out.println(AllStudents.NoOfStudents);
	}

}
	//三个实例对象共享一个静态变量的值。前面三个打印语句是实例对象调用实例方法，第四个打印语句是类调用静态变量。
