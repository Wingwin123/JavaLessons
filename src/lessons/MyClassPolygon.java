/*��ϰ�lessons��Polygon.java��Rectangle.java��Triangle.java��ѧϰ�̳С�
 * https://blog.csdn.net/u011541946/article/details/73253463
 * �ܽ�����仰��

1) ����ӵ�и����private���Ժͷ���

2) �������ӵ���Լ������Ժͷ�������������ԶԸ��������չ

3) ����������Լ��ķ�ʽȥʵ�ָ���ķ���
 */
package lessons;

public class MyClassPolygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		
		rec.set_values(10, 20);   //����ӵ�и��ࣨPolygon����private���Ժͷ���
		tri.set_values(8, 13);
		
		System.out.println(rec.area());  //�������ӵ���Լ������Ժͷ���
		System.out.println(tri.area());
	}

}
