/*
	����
	A:����Щ����?
				����
				����
				Demo
	B:ÿ��������Щ������?
				����
					��ȥ
				���䣺
					����
					����
				Demo:
					main����
	C:������ֱ�ӵĹ�ϵ��ʲô��?
				Demo��ʹ�ô���ͱ�����Ĺ��ܡ�
*/
class Elephant{
	public static in(){
		System.out.println("��ȥ");
	}
}
class Freg{
	public static open(){
		System.out.println("�򿪱���");
	}
	public static close(){
		System.out.println("�رձ���");
	}
}


class ElephantDemo2{
	public static void main(String[] args){
		//�ñ����
		Freg.open();
		//�ô����߽�ȥ
		Elephant.in();
		//�ñ���ر�
		Freg.close();
	}
}