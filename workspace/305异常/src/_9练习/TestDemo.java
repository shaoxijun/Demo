package _9练习;

public class TestDemo
{
	
	public static void main(String[] args)
	{
				// 创建一个业务员对象，设定好固定工资和销售提成
				// 让他每天工作
				// 一定概率 正常工作 随机一个当天销售额 然后乘以销售提成比率 累积到当月奖金中
				// 月底显示薪水是多少.(固定工资+奖金-扣除的)
		Game g = new Game();
		Salesman s = new Salesman();
		s.name = "刘德华";
		s.age = 20;
		s.basic = 3000;
		s.rate = 0.02;
		g.date(s);
	}
}
