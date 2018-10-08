/*
	命名原则：见名知意
	
	this概念：
	this作用:

*/
class Student{

	private String name;
	private int age;


	public void setName(String n){
		
		name=n;
		//name=name;//引入this	
		}

	public int getName(){
		return name;
	}	

	public void setAge(int a){		
			age=a;
		//age=age;//引入this	
		}
	
	public int getAge(){
		return age;
	}
}
class ThisDemo{
	public static void main(String[] args){
		Student st=new Student();
		
		//给成员变量赋值
		st.setName("外包16");
		st.age =2;

		System.out.println(st.getName()+"-------"+st.getAge());			
		
	}
}