/*
	需求：
	A:有哪些类呢?
				大象
				冰箱
				Demo
	B:每个类有哪些东西呢?
				大象：
					进去
				冰箱：
					开门
					关门
				Demo:
					main方法
	C:类与类直接的关系是什么呢?
				Demo中使用大象和冰箱类的功能。
*/
class Elephant{
	public static in(){
		System.out.println("进去");
	}
}
class Freg{
	public static open(){
		System.out.println("打开冰箱");
	}
	public static close(){
		System.out.println("关闭冰箱");
	}
}


class ElephantDemo2{
	public static void main(String[] args){
		//让冰箱打开
		Freg.open();
		//让大象走进去
		Elephant.in();
		//让冰箱关闭
		Freg.close();
	}
}