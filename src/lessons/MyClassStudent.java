//��ϰ�lessons��Student.javaѧϰ��ͷ���
//https://blog.csdn.net/u011541946/article/details/73009727
package lessons;

public class MyClassStudent {

	public static void main(String[] args) {
		Student Anthony = new Student();//Anthony ��һ������ ����ʵ��
		
		Anthony.setId(1);
		Anthony.setName("Anthony");
		Anthony.setAge(18);
		
		System.out.println(Anthony.name+"is "+Anthony.age+" years old.");
	}

}
