/*��ϰ�lessons��Hello.java��ѧϰstatic�ؼ���
https://blog.csdn.net/u011541946/article/details/73188529
�ܽ᣺
�õ���static���εķ������߱�����ֻ�ܱ��౾����ã��磺Hello.java��public static void DoSomethingWithStatic()������Hello.DoSomethingWithStatic();
Hello.java��	public static String name�������Hello.name="Anthony";
û��static���εķ�����ʵ��������ʵ�������ܵ���ʵ���������磺Hello.java��public void DoSomethingWithNoStatic()������hello.DoSomethingWithNoStatic();
*/

package lessons;

public class MyClassHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���þ�̬�����͵���ʾ������
		Hello hello = new Hello();
		
		//�౾����þ�̬����
		Hello.DoSomethingWithStatic();
		
		//ʵ���������ʵ�����������ʵ�����þ�̬����������־��棨����ڶ��䣩����Ȼ�������ǻ����гɹ���
		hello.DoSomethingWithNoStatic();
		hello.DoSomethingWithStatic();
		
		//�౾����þ�̬��Ա����
		Hello.name="Anthony";
		System.out.println(Hello.name);
		
		//ʵ��������þ�̬��Ա����������־��棬���£���Ȼ�������ǻ����гɹ���
		hello.name="Tom";
		System.out.println("hello.name");
		
	}

}
