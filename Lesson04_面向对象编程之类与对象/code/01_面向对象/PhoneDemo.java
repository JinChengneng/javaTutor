/*
	���󣺶���һ���ֻ���
	������
		����ֻ�
		���ԣ�Ʒ�ƣ���ɫ���۸�
		��Ϊ����绰�������ţ�����Ϸ
	���裺
		�ࣺPhone
		��Ա������brand��color��price
		��Ա������call(),sendMessage(),playGame();
*/
class Phone{
	String brand;
	String color;
	float price;
	public void call(String name){
		System.out.println("��"+name+"��绰");
	}
	public void sendMessage(){
		System.out.println("������");
	}
	public void playGame(){
		System.out.println("����Ϸ");
	}
}

class PhoneDemo{
	public static void main(String[] args){
		Phone p1=new Phone();
		p1.brand="iphone 8 plus";
		p1.color="������";
		p1.price=7999;
		System.out.println(p1.brand+":"+p1.color+":"+p1.price);
		p1.call("�¿���");
		Phone p2 =  new Phone();
		p2.brand="��ΪMate9";
		p2.color="��ɫ";
		p2.price=3588;
		System.out.println(p2.brand+":"+p2.color+":"+p2.price);
		p2.playGame();
	}
	
}