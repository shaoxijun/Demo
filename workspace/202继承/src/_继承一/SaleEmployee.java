package _¼Ì³ÐÒ»;

public class SaleEmployee  extends ServeEmployee
{
	int baseMOney;
	int ticheng;
	void getSalary()
	{
		int salary = this.baseMOney + this.ticheng;
		if(this.date == this.birthday)
		{
			salary +=100;
		}
	}
}
