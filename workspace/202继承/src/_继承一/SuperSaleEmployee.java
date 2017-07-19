package _¼Ì³ÐÒ»;

public class SuperSaleEmployee extends SaleEmployee
{
	int fenhong;
	@Override
	void getSalary()
	{
		int salary = this.baseMOney + this.ticheng+this.fenhong;
		if(this.date == this.birthday)
		{
			salary +=100;
		}
	}
}
