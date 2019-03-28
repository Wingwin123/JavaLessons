package lessons;

public class MyClassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarray ={1,4,5,2,9};
		/*还有其他创建数组的方式
		 * int [] myArray= new int[3];          //定义一个数组，有3个元素
		 * int [] myArray ={1,2,3};             //给这个数组赋值
		 * int [] myArray =new int[]{1,2,3};    //上面两行可以简写成这一行
		 */
		//根据索引来读取数组元素，索引从0开始，例如myarry[0]=1
		System.out.println("数组索引为0的元素为："+myarray[0]);
		
		//myarry.length表示数组长度，也就是元素个数
		System.out.println("数组长度为"+myarray.length);
		
		//遍历数组元素，这个用while循环实现数组元素遍历
		int index=0;
		
		while (index<myarray.length){
			System.out.println(myarray[index]);
			index++;
		}
	}

}
