package lessons;

public class MyClassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarray ={1,4,5,2,9};
		/*����������������ķ�ʽ
		 * int [] myArray= new int[3];          //����һ�����飬��3��Ԫ��
		 * int [] myArray ={1,2,3};             //��������鸳ֵ
		 * int [] myArray =new int[]{1,2,3};    //�������п��Լ�д����һ��
		 */
		//������������ȡ����Ԫ�أ�������0��ʼ������myarry[0]=1
		System.out.println("��������Ϊ0��Ԫ��Ϊ��"+myarray[0]);
		
		//myarry.length��ʾ���鳤�ȣ�Ҳ����Ԫ�ظ���
		System.out.println("���鳤��Ϊ"+myarray.length);
		
		//��������Ԫ�أ������whileѭ��ʵ������Ԫ�ر���
		int index=0;
		
		while (index<myarray.length){
			System.out.println(myarray[index]);
			index++;
		}
	}

}
