/*
	��ʽ���������⣺
		�������ͣ��βεĸı䲻Ӱ��ʵ�ʲ���
		�������ͣ��βεĸı�ֱ��Ӱ��ʵ�ʲ���

*/

//��ʽ�����ǻ�������
class Demo{
	public int sum(int a,int b){
		return a+b;
	}
}

//
class ClassType {
	public void show() {
		System.out.println("��������Ϊ������");
	}
}


class ClassTypeDemo {
	//��������Ĳ�����һ�������ͣ��������ͣ�����ôʵ����Ҫ����������һ������Ķ���
	public void method(ClassType s) {
		s.show();
	}
} 

class ArgsTest {
	public static void main(String[] args) {
		//�����β�Ϊ�������͵����
		Demo d1= new Demo();
		int result=d1.sum(20,50);
		System.out.println("result"+result);

		//�����β�Ϊ��������(������)�����
		ClassTypeDemo sd = new ClassTypeDemo();
		ClassType s = new ClassType();
		sd.method(s);

		//���������д��
		sd.method(new ClassType())
		new ClassTypeDemo().method(new ClassType());
	}
}
