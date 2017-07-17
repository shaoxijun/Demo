package 封装和隐藏;

public class Plural
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
	public Plural()
	{}
	public Plural(int n, int d)
	{
		super();
		this.n = n;
		this.d = d;
	}
	public Plural add(Plural f)
	{
		int a = this.n * f.d +this.d * f.n;
		int b = this.d * f.d;
		Plural c = new Plural(a,b);
		return c;		
	}
	public Plural sub(Plural f)
	{
		int a = this.n * f.d -this.d * f.n;
		int b = this.d * f.d;
		Plural c = new Plural(a,b);
		return c;		
	}
	public Plural mul(Plural f)
	{
//		（a+bi）·（c+di）=（ac－bd）+（bc+ad）i
		int a = this.n * f.n - this.d * f.d;
		int b = this.d * f.n + this.n * f.d;
		Plural c = new Plural(a,b);
		return c;
	}
	public Plural div(Plural f)
	{
//		（a+bi）/（c+di）=[（ac+bd）/（c²+d²）]+[（bc-ad）/（c²+d²）]i
		int a = (this.n * f.n + this.d * f.d)/(f.n * f.n+f.d * f.d);
		int b = f.n * f.n+f.d * f.d;
		Plural c = new Plural(a,b);
		return c;
	}
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return n+"+"+d+"i";
	}
}
