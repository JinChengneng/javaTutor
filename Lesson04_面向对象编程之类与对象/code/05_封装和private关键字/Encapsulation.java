/*
	问题一：成员变量赋值可能会出现一些不合理的数据；
	解决办法：在赋值前，应对数据进行判断；


	问题二：如何才能做到只能在类的内部才能修改类的数据，而外部不能修改？
	
	通过私有化成员变量，外部不能直接访问，只能自己访问，这就是封装的思想！！！
        private：权限修饰符，可修饰成员变量与方法，被修饰者只能在本类中被访问
		
*/
class Student{
	//成员变量
	String name; //默认值为null
	//String id;
	//int age;    //默认值为0
	private int age;
	
	//成员方法
	public void show(){
		System.out.println("姓名"+name);
		System.out.println("年龄"+age);
	}
	public void setAge(int a){
		if(a>=1&&a<=4){
			age=a;
		}else{
			System.out.println("年龄为1-4之间");
		}
	}
	public int getAge(){
		return age;
	}
}

//主类，包含main
class Encapsulation{
	public static void main(String[] args){
		//获得一个类的具体的对象
		Student st=new Student();
		//st.show();
		//System.out.println("--------------");

		//给成员变量赋值
		/* st.name = "外包16";
		st.age =2;
		st.show();
		System.out.println("--------------"); */		

		//给成员变量赋一个不合理的值
		/* st.age =-2;
		st.show();
		System.out.println("--------------");
 */
		st.name = "外包16";
		//st.age =-2;
		st.setAge(23);
		System.out.println(st.name+","+","+st.getAge());
	}
}