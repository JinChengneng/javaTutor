/*
	����һ����Ա������ֵ���ܻ����һЩ����������ݣ�
	����취���ڸ�ֵǰ��Ӧ�����ݽ����жϣ�


	���������β�������ֻ��������ڲ������޸�������ݣ����ⲿ�����޸ģ�
	
	ͨ��˽�л���Ա�������ⲿ����ֱ�ӷ��ʣ�ֻ���Լ����ʣ�����Ƿ�װ��˼�룡����
        private��Ȩ�����η��������γ�Ա�����뷽������������ֻ���ڱ����б�����
		
*/
class Student{
	//��Ա����
	String name; //Ĭ��ֵΪnull
	//String id;
	//int age;    //Ĭ��ֵΪ0
	private int age;
	
	//��Ա����
	public void show(){
		System.out.println("����"+name);
		System.out.println("����"+age);
	}
	public void setAge(int a){
		if(a>=1&&a<=4){
			age=a;
		}else{
			System.out.println("����Ϊ1-4֮��");
		}
	}
	public int getAge(){
		return age;
	}
}

//���࣬����main
class Encapsulation{
	public static void main(String[] args){
		//���һ����ľ���Ķ���
		Student st=new Student();
		//st.show();
		//System.out.println("--------------");

		//����Ա������ֵ
		/* st.name = "���16";
		st.age =2;
		st.show();
		System.out.println("--------------"); */		

		//����Ա������һ���������ֵ
		/* st.age =-2;
		st.show();
		System.out.println("--------------");
 */
		st.name = "���16";
		//st.age =-2;
		st.setAge(23);
		System.out.println(st.name+","+","+st.getAge());
	}
}