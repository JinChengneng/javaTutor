/*
	��������1-100�����
	������
		A��Math.random()�õ�0-1֮��ĸ�����������-����+1��*����+����
*/
class RandomDemo{
	public static void main(String[] args){
		for(int i = 0;i<10;i++){
		int random = (int)(Math.random()*100)+1;
		System.out.print(random+",");
		}
	}
}