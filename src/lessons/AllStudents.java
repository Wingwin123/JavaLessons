package lessons;

public class AllStudents {
	String name;
	int age;
	static int NoOfStudents=0;
	
	//���캯����
	AllStudents(){    
		NoOfStudents++;
	}
	
	public int getNoOfStudents(){
		return NoOfStudents;
	}	
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age=age;
	}
}
