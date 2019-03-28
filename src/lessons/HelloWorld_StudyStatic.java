/*学习 构造方法，初始化块，静态初始化块
静态初始化块只在类加载时执行，且只会执行一次，同时静态初始化块只能给静态变量赋值，不能初始化普通的成员变量。
 * */
package lessons;

public class HelloWorld_StudyStatic {
	int num1;//声明变量num1；
	int num2;//声明变量num2；
	static int num3;//声明静态变量num3；
	
	public HelloWorld_StudyStatic (){
		//构造方法
		num1=91;
		System.out.println("通过构造方法为变量num1赋值");
	}
	
	{
		//初始化
		num2=74;
		System.out.println("通过初始化块为变量num2赋值");		
	}		
		
	static{
		//静态初始化块
		num3=83;
		System.out.println("通过静态初始化块为静态变量num3赋值");
	}

	public static void main(String[] args){
		HelloWorld_StudyStatic hello=new HelloWorld_StudyStatic();
		System.out.println("num1:"+hello.num1);//创建类的对象hello
		System.out.println("num2:"+hello.num2); 
		System.out.println("num3:"+num3); 
		HelloWorld_StudyStatic hello2=new HelloWorld_StudyStatic();//创建类的对象hello2
	}
}

	/*运行结果：
通过静态初始化块为静态变量num3赋值
通过初始化块为变量num2赋值
通过构造方法为变量num1赋值
num1:91
num2:74
num3:83
通过初始化块为变量num2赋值
通过构造方法为变量num1赋值
	结论： 
	程序运行时静态初始化块最先被执行（num3），然后执行普通初始化块（num2），最后才执行构造方法（num1）。
 	由于静态初始化块只在类加载时执行一次，所以当再次创建对象 hello2 时并未执行静态初始化块。
	 * */
