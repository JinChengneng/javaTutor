/*
	���췽����
		���ã�Ϊ����ĳ�Ա��������ֵ
		��ʽ��
			A����������������ͬ
			B��û�з���ֵ���ͣ���void��û��	
		ע��:
			A: �������û�и������췽������ϵͳĬ�ϸ����޲ι��췽��
			B����������ṩ�˹��췽����ϵͳ�����ṩ�޲ι��췽����������Զ�����޲ι��췽��
			C�����췽���������أ���������ͬ���������ͻ������ͬ��
*/		
class Student{
	String name;
	String id;
	int age;
	/*
	public Student(){
		System.out.println("�����޲ι��췽��");
	}
	*/
	public Student(String name){
		System.out.println("���Ǵ����ֲ����Ĺ��췽��");
		this.name=name;
	}
	
}
class ConstructDemo{
	public static void main(String[] args){
		Student st = new Student();
		System.out.println(st.name+","+st.id+","+st.age);
		System.out.println("------------");
		Student st1 = new Student("����");
		System.out.println(st1.name+","+st1.id+","+st1.age);
	}
}