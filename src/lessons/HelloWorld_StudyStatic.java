/*ѧϰ ���췽������ʼ���飬��̬��ʼ����
��̬��ʼ����ֻ�������ʱִ�У���ֻ��ִ��һ�Σ�ͬʱ��̬��ʼ����ֻ�ܸ���̬������ֵ�����ܳ�ʼ����ͨ�ĳ�Ա������
 * */
package lessons;

public class HelloWorld_StudyStatic {
	int num1;//��������num1��
	int num2;//��������num2��
	static int num3;//������̬����num3��
	
	public HelloWorld_StudyStatic (){
		//���췽��
		num1=91;
		System.out.println("ͨ�����췽��Ϊ����num1��ֵ");
	}
	
	{
		//��ʼ��
		num2=74;
		System.out.println("ͨ����ʼ����Ϊ����num2��ֵ");		
	}		
		
	static{
		//��̬��ʼ����
		num3=83;
		System.out.println("ͨ����̬��ʼ����Ϊ��̬����num3��ֵ");
	}

	public static void main(String[] args){
		HelloWorld_StudyStatic hello=new HelloWorld_StudyStatic();
		System.out.println("num1:"+hello.num1);//������Ķ���hello
		System.out.println("num2:"+hello.num2); 
		System.out.println("num3:"+num3); 
		HelloWorld_StudyStatic hello2=new HelloWorld_StudyStatic();//������Ķ���hello2
	}
}

	/*���н����
ͨ����̬��ʼ����Ϊ��̬����num3��ֵ
ͨ����ʼ����Ϊ����num2��ֵ
ͨ�����췽��Ϊ����num1��ֵ
num1:91
num2:74
num3:83
ͨ����ʼ����Ϊ����num2��ֵ
ͨ�����췽��Ϊ����num1��ֵ
	���ۣ� 
	��������ʱ��̬��ʼ�������ȱ�ִ�У�num3����Ȼ��ִ����ͨ��ʼ���飨num2��������ִ�й��췽����num1����
 	���ھ�̬��ʼ����ֻ�������ʱִ��һ�Σ����Ե��ٴδ������� hello2 ʱ��δִ�о�̬��ʼ���顣
	 * */
