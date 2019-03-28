/*结合包lessons的Hello.java，学习static关键字
https://blog.csdn.net/u011541946/article/details/73188529
总结：
用到了static修饰的方法或者变量，只能被类本身调用，如：Hello.java的public static void DoSomethingWithStatic()，这里Hello.DoSomethingWithStatic();
Hello.java的	public static String name，这里的Hello.name="Anthony";
没有static修饰的方法是实例方法，实例对象能调用实例方法。如：Hello.java的public void DoSomethingWithNoStatic()，这里hello.DoSomethingWithNoStatic();
*/

package lessons;

public class MyClassHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//调用静态方法和调用示例方法
		Hello hello = new Hello();
		
		//类本身调用静态方法
		Hello.DoSomethingWithStatic();
		
		//实例对象调用实例方法，如果实例调用静态方法，会出现警告（下面第二句），虽然报错，但是会运行成功。
		hello.DoSomethingWithNoStatic();
		hello.DoSomethingWithStatic();
		
		//类本身调用静态成员变量
		Hello.name="Anthony";
		System.out.println(Hello.name);
		
		//实例对象调用静态成员变量，会出现警告，如下，虽然报错，但是会运行成功。
		hello.name="Tom";
		System.out.println("hello.name");
		
	}

}
