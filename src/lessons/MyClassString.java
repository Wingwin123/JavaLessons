//main����printlnʱ�����жϵ���������Ǹ�Add����������Ƿ���������
//https://blog.csdn.net/u011541946/article/details/73124213

package lessons;

public class MyClassString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Add(5,9));
		System.out.println(Add(5.8,9.34));
		System.out.println(Add("Hello","Java"));
	}
	public static int Add(int a,int b){
		return (a+b);
	}
	
	public static double Add(double a,double b){
		return (a+b);
	}
	public static String Add(String a,String b){
		return (a+b);
	}  

}
