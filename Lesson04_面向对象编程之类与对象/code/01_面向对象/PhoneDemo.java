/*
	需求：定义一个手机类
	分析：
		事物：手机
		属性：品牌，颜色，价格
		行为：打电话，发短信，玩游戏
	步骤：
		类：Phone
		成员变量：brand，color，price
		成员方法：call(),sendMessage(),playGame();
*/
class Phone{
	String brand;
	String color;
	float price;
	public void call(String name){
		System.out.println("给"+name+"打电话");
	}
	public void sendMessage(){
		System.out.println("发短信");
	}
	public void playGame(){
		System.out.println("玩游戏");
	}
}

class PhoneDemo{
	public static void main(String[] args){
		Phone p1=new Phone();
		p1.brand="iphone 8 plus";
		p1.color="土豪金";
		p1.price=7999;
		System.out.println(p1.brand+":"+p1.color+":"+p1.price);
		p1.call("陈俊杰");
		Phone p2 =  new Phone();
		p2.brand="华为Mate9";
		p2.color="白色";
		p2.price=3588;
		System.out.println(p2.brand+":"+p2.color+":"+p2.price);
		p2.playGame();
	}
	
}