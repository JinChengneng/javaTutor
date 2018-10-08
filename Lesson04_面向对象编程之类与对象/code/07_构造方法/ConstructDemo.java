/*
	构造方法：
		作用：为对象的成员变量赋初值
		格式：
			A：方法名与类名相同
			B：没有返回值类型，连void都没有	
		注意:
			A: 如果我们没有给出构造方法，则系统默认给出无参构造方法
			B：如果我们提供了构造方法，系统不再提供无参构造方法，建议永远给出无参构造方法
			C：构造方法可以重载（方法名相同，参数类型或个数不同）
*/		
class Student{
	String name;
	String id;
	int age;
	/*
	public Student(){
		System.out.println("这是无参构造方法");
	}
	*/
	public Student(String name){
		System.out.println("这是带名字参数的构造方法");
		this.name=name;
	}
	
}
class ConstructDemo{
	public static void main(String[] args){
		Student st = new Student();
		System.out.println(st.name+","+st.id+","+st.age);
		System.out.println("------------");
		Student st1 = new Student("李宁");
		System.out.println(st1.name+","+st1.id+","+st1.age);
	}
}