import java.util.Scanner;
public class ѭ���ṹ��ϰ
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i=1;
		long n;
//		��ӡ100��*
		while(i<=100)
		{
			System.out.print("*");
			i++;
		}
		System.out.print("\n");
//		����1+2+3...+n��ֵ
		System.out.print("������һ�����ּ���1+2+...+n��ֵ��");
		n=sc.nextInt();
		int sum=0,l;
		for(l=0;l<=n;l++)
		{
			sum+=l;	
		}
		System.out.println("1+2+...+n="+sum);
//		��ӡ1-500����֮���ã��ָ�
		
		for(int m=1;m<=500;m++)
		{
			System.out.print(m+",");
			
		}
		System.out.print("\n");
//		��ӡ-100��-98.����-2��0
		for(int num=-100;num<=0;)
		{
			System.out.print(num+",");
			num+=2;
			
		}
		System.out.print("\n");
//		����1*2*...*10
		n=1;
		for(i=1;i<=10;i++)
		{
			
			n*=i;
			
		}
//		�û�����һ������n,��ӡn��*
		System.out.print("������һ�������������*��");
		n=sc.nextInt();
		
		for(l=1;l<=n;l++)
		{
			System.out.print("*");
		}
		System.out.println("\n");
//		��һ�������������
		System.out.print("������һ�����֣�");
		n=sc.nextInt();
		while(n!=0)
		{
	        System.out.print(n%10);
	        n/=10;
		}
		System.out.println("\n");
//		���û���������n����ӡ��0 2 4 ...2^n
		sum=1; 
		int a=0;
		System.out.print("����������n��2^n��:");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			sum=(sum*=2);//sum=((sum*=2)/2)?
			a=sum/2;
			System.out.print("2^"+i+"="+a+",");
		}
		
		System.out.println();
//		���û���������n����ӡ��0  1  4....n^2
		System.out.print("����������n��n^2��:");
		n=sc.nextInt();
		double n2;
		for(i=1;i<=n;i++)
		{
			
			n2=i*i;
			System.out.print(i+"^2="+n2+",");
		}
		System.out.println();
//		��ӡ-10.0 -9.9 -9.8 ....9.9  10.0
		float m;
		for(m=-100;m<=100;m+=1)
		{
			
			System.out.print(m/10+",");
		}
		System.out.println();
		
/*		һ�����100�׸߶�������·��ÿ����غ󷴵��߶�Ϊԭ�߶�һ�룬�ٴ�����.
		������10�����ʱ�������������ף���10�˷�����ߣ�
*/
		m=100;
		a=100;
		for(i=1;i<=10;i++)
		{
			m/=2;
			a+=(2*m);
		}
		l= (int)(a-2*m);
		System.out.println("��10����ؾ���"+l+"��");
		System.out.println("��10�η���Ϊ"+m+"��");
//		�����ж�������λ���Ƿ�ˮ�ɻ�����������ǡ�
		for( i = 100; i < 1000; i++)
		{
            int b = i / 100;
            int s = i % 100 / 10;
            int g = i % 10;
            if(b * b * b + s * s * s + g * g * g == i)
            {
                System.out.print(i+",");
            }
		}
		System.out.println();
//		��ӡ
//		*
//		**
//		***
//		****
//		*****
		for(i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");	
			}
			System.out.println();
		}
//		��ӡ
//		*****
//		****
//		***
//		**
//		*
		for(i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");	
			}
			System.out.println();
		}
//		��ӡ
//		    *
//		   **
//		  ***
//		 ****
//		*****

		for(i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print('\0');	
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");	
			}
			System.out.println();
		}
//		��ӡ
//		 ****
//		  ***
//		   **
//		    *
		for(i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(1);
			}
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

		
		
		
		
//		��ӡ
//		    *
//		   ***
//		  *****
//		 *******
//		  *****
//		   ***
//		    *
		
		for(i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print('\0');	
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");	
			}
			System.out.println();
		}
		
		for(i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(' ');
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=3;j<=i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			}
		for(i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(' ');
			}
			for(int j=3;j>=i;j--)
			{
				System.out.print("*");
			}
			for(int j=2;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}       
//	       ��ӡ��������
		for(i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				
			}
		}
	            
		
	}

}
