/*��ϰ�Lessons��Cube.javaѧϰ���캯����
 * https://blog.csdn.net/u011541946/article/details/73117007
 * �ܽ᣺

1�����캯������һ��Ҫ�������Ʊ���һ�¡�

2�����캯�����ڶ��󴴽������ǵ��ã�����в���ֱ��������������c2.

3�����캯�������ж�����ò��������Ͳ�����������

4�����캯���ڲ�û�з������
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
