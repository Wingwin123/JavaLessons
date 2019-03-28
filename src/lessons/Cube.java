package lessons;

public class Cube {
	int length;
	int width;
	int height;
		
	public int getCubeVolum(){
		return (length*width*height);
	}
	Cube(){
		//System.out.println("这是一个构造函数");
		length=10;
		width=20;
		height=30;
		
	}
	
	//定义一个有三个参数的构造函数
	Cube(int l,int w,int h){
		length=l;
		width=w;
		height=h;
	}

}
