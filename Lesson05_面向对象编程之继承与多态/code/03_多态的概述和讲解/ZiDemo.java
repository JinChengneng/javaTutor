class Fu{
	int age = 40;
	public void show(){
		System.out.println("show fu");
	}
}
class Zi extends Fu{
	int age = 20;
	public void show(){
		System.out.println("show zi");
	}
}
class ZiDemo{
	public static void main(String[] args){
		Zi z = new Zi();
		Fu f =  new Fu();
		System.out.println(z.age);
		z.show();
		System.out.println(f.age);
		f.show();
	}
}