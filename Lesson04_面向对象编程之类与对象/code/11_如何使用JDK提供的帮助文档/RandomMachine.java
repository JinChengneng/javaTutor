/*
	��������һ�������������
		  ������ɷ�Χ��1-65���n��������n����0С��65���ֶ����룩
	      ����Ļ����ʾ
	��������������n�������ӡ
		1.Scanner����nֵ
			1.1 import java.util.Scanner
			1.2	Scanner sc = new Scanner(System.in);
			1.3 int n = sc.nextInt();
		2.forѭ��n�Σ���ӡ�������
			2.1	ʹ��Math�����������,[0,1.0)֮���double����
			2.2	ת��Ϊ���� int rand = (int)(Math.random())*65+1
			2.3 ��ӡ
*/
import java.util.Scanner;
class RandomMachine{
	public static void main(String[] args){
		System.out.println("������������ĸ�����");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0;i<n;i++){
			int rand = (int)(Math.random()*65)+1;
			System.out.print(rand + ",");
		}
	}
}