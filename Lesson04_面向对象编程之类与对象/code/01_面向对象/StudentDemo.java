/*
	ѧ���ࣺ
     		��Ա����������������
		��Ա�������ϿΡ����

	
	һ���ļ�����������,һ��Ϊ�����࣬һ��Ϊ�����ࡣ
	���ʹ�÷�����1����������
		      		��ʽ������ ������ = new ��������;
		      2����Ա�����뷽��ʹ��
				������.��������������.������

*/


class Student {
    	
	//�����Ա����		
    	String name;
	int age;    

	//�����Ա����
	//�Ͽεķ���
        public void goToClass() {
		System.out.println("ѧ��Ҫ�Ͽ�");
	}


	//��̵ķ���
   	public void coding() {
		System.out.println("����κ�Ҫ���");
	}
	
}


//������
class StudentDemo{
	public static void main(String[] args) {
		
		Student s = new Student();
		
		System.out.println(s.name);
		
		//��Ա�����ֵ
		s.name="����"
                System.out.println(s.name);
		
		//��������
		s.goToClass();
		s.coding();
	}
}
