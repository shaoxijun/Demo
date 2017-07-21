package _1接口一;

public class Aircondition
{
			// 创建一个空调对象。每隔一段时间，就会坏,损坏程度随机1~100
			// 如果坏了，就报修。
			// 报修的结果，如果损坏程度是<50,来的是公司内部的维护部的小明
			// 让他修空调。
			// 修完打印一下空调状态。		
			// 报修的结果，如果损坏程度是>50,来的是一个专业维修人员
			// 让他修空调
			// 修改打印一下空调状态。
	private int degree;
	IRepairAble r1;
	IRepairAble r2;
	public int getDegree()
	{
		return degree;
	}

	public void setDegree(int degree)
	{
		System.out.println("空调目前状态"+degree);
		this.degree = degree;
		if(this.degree <=50&&this.degree>0)
		{
			r1.repair();
//			System.out.println("5");
		}
		else if(this.degree>50)
		{
			r2.repair();
//			System.out.println("100");
		}
		else
		{System.out.println("空调没有坏");}
	}
	
}
