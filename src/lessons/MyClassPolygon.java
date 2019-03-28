/*结合包lessons的Polygon.java、Rectangle.java、Triangle.java，学习继承。
 * https://blog.csdn.net/u011541946/article/details/73253463
 * 总结就三句话：

1) 子类拥有父类非private属性和方法

2) 子类可以拥有自己的属性和方法，即子类可以对父类进行扩展

3) 子类可以用自己的方式去实现父类的方法
 */
package lessons;

public class MyClassPolygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		
		rec.set_values(10, 20);   //子类拥有父类（Polygon）非private属性和方法
		tri.set_values(8, 13);
		
		System.out.println(rec.area());  //子类可以拥有自己的属性和方法
		System.out.println(tri.area());
	}

}
