/*
	形式参数的问题：
		基本类型：形参的改变不影响实际参数
		引用类型：形参的改变直接影响实际参数

*/

//形式参数是基本类型
class Demo{
	public int sum(int a,int b){
		return a+b;
	}
}

//
class ClassType {
	public void show() {
		System.out.println("引用类型为类类型");
	}
}


class ClassTypeDemo {
	//如果方法的参数是一个类类型（引用类型），那么实际需要的是这个类的一个具体的对象
	public void method(ClassType s) {
		s.show();
	}
} 

class ArgsTest {
	public static void main(String[] args) {
		//调用形参为基本类型的情况
		Demo d1= new Demo();
		int result=d1.sum(20,50);
		System.out.println("result"+result);

		//调用形参为引用类型(类类型)的情况
		ClassTypeDemo sd = new ClassTypeDemo();
		ClassType s = new ClassType();
		sd.method(s);

		//匿名对象的写法
		sd.method(new ClassType())
		new ClassTypeDemo().method(new ClassType());
	}
}
