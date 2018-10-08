/*
	需求：生成一个随机点名器，
		  随机生成范围在1-65间的n个整数（n大于0小于65，手动输入）
	      在屏幕上显示
	分析：输入整数n，输出打印
		1.Scanner类获得n值
			1.1 import java.util.Scanner
			1.2	Scanner sc = new Scanner(System.in);
			1.3 int n = sc.nextInt();
		2.for循环n次，打印出随机数
			2.1	使用Math类生成随机数,[0,1.0)之间的double类型
			2.2	转换为整数 int rand = (int)(Math.random())*65+1
			2.3 打印
*/
import java.util.Scanner;
class RandomMachine{
	public static void main(String[] args){
		System.out.println("请输入随机数的个数：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0;i<n;i++){
			int rand = (int)(Math.random()*65)+1;
			System.out.print(rand + ",");
		}
	}
}