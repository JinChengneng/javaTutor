/*
	����ԭ�򣺼���֪��
	
	this���
	this����:

*/
class Student{

	private String name;
	private int age;


	public void setName(String n){
		
		name=n;
		//name=name;//����this	
		}

	public int getName(){
		return name;
	}	

	public void setAge(int a){		
			age=a;
		//age=age;//����this	
		}
	
	public int getAge(){
		return age;
	}
}
class ThisDemo{
	public static void main(String[] args){
		Student st=new Student();
		
		//����Ա������ֵ
		st.setName("���16");
		st.age =2;

		System.out.println(st.getName()+"-------"+st.getAge());			
		
	}
}