import java.util.Scanner;

public class test1
{

	public static void main(String[] args)
	{
    
            
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(' ');
				if(i==j)
				{System.out.print("*");}
			}
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(1);
			}
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(2);//' '
				if(j==i)
				{ System.out.print(3);}
			}
			
			System.out.println();
		}
			
	
        
		
	}	
}


