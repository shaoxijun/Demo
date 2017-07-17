package 撃廾才咨茄;

public class Arithmetic
{
	private int n;
	private int d;
	
	public int getN()
	{
		return n;
	}
	public void setN(int n)
	{
		this.n = n;
	}
	public int getD()
	{
		return d;
	}
	public void setD(int d)
	{
		this.d = d;
	}
//！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
	public Arithmetic()
	{
		
	}
	public Arithmetic(int n, int d)
	{
		super();
		this.n = n;
		this.d = d;
	}
	
	public Arithmetic add(Arithmetic f)
	{
		int a = this.n * f.d +this.d * f.n;
		int b = this.d * f.d;
		Arithmetic c = new Arithmetic(a,b);
		return c;		
	}
	public Arithmetic sub(Arithmetic f)
	{
		int a = this.n * f.d -this.d * f.n;
		int b = this.d * f.d;
		Arithmetic c = new Arithmetic(a,b);
		return c;		
	}
	public Arithmetic mul(Arithmetic f)
	{
		int a = this.n * f.n ;
		int b = this.d * f.d;
		Arithmetic c = new Arithmetic(a,b);
		this.reduce();
		return c;		
	}
	public Arithmetic div(Arithmetic f)
	{
		int a = this.n * f.d ;
		int b = this.d * f.n;
		Arithmetic c = new Arithmetic(a,b);
		this.reduce();
		return c;		
	}
	public void reduce()
	{
		int a=this.n,b=this.d;
		for(int i=2;i<=a&&i<=b;i++)
		{
			if(a%i==0&&b%i==0)
			{
				a/=i;
				b/=i;				
			}
		} 
		this.n = a;
		this.d = b;
	}
	
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return n+"/"+d;
	}
}
