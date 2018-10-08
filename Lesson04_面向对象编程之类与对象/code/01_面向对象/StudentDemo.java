/*
	学生类：
     		成员变量：姓名、年龄
		成员方法：上课、编程

	
	一个文件中有两个类,一个为基本类，一个为测试类。
	类的使用方法：1、创建对象
		      		格式：类名 对象名 = new 类名（）;
		      2、成员变量与方法使用
				对象名.变量名；对象名.方法名

*/


class Student {
    	
	//定义成员变量		
    	String name;
	int age;    

	//定义成员方法
	//上课的方法
        public void goToClass() {
		System.out.println("学生要上课");
	}


	//编程的方法
   	public void coding() {
		System.out.println("上完课后要编程");
	}
	
}


//测试类
class StudentDemo{
	public static void main(String[] args) {
		
		Student s = new Student();
		
		System.out.println(s.name);
		
		//成员变更赋值
		s.name="王者"
                System.out.println(s.name);
		
		//方法调用
		s.goToClass();
		s.coding();
	}
}
