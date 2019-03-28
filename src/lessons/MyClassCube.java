/*结合包Lessons的Cube.java学习构造函数。
 * https://blog.csdn.net/u011541946/article/details/73117007
 * 总结：

1）构造函数名称一定要和类名称保持一致。

2）构造函数会在对象创建过程是调用，如果有参数直接塞参数，如下c2.

3）构造函数可以有多个，用参数个数和参数类型区分

4）构造函数内部没有返回语句
 */
package lessons;

public class MyClassCube {
	public static void main(String[] args){
		Cube c1=new Cube();
		System.out.println(c1.getCubeVolum());

		Cube c2=new Cube(20,20,20);
		System.out.println(c2.getCubeVolum());

	}

}
