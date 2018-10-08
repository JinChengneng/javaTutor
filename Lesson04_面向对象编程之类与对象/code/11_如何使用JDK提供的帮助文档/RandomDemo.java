/*
	需求：生成1-100随机数
	分析：
		A：Math.random()得到0-1之间的浮点数（上限-下限+1）*上限+下限
*/
class RandomDemo{
	public static void main(String[] args){
		for(int i = 0;i<10;i++){
		int random = (int)(Math.random()*100)+1;
		System.out.print(random+",");
		}
	}
}