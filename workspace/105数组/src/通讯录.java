
import java.util.Scanner;

public class 通讯录
{
	static final int SIZE=10;
	static String[][] list=new String[SIZE][4];
	static Scanner sc=new Scanner(System.in);	
	static int q;
	public static void main(String[] args)
	{
//		for(int i=0;i<SIZE;i++)
//		{
//			for(int j=0;j<list[i].length;i++)
//			{
//				System.out.println(list[i][j]+"  ");
//			}
//			System.out.println();
//		}
		ab:
		while(true) 
		{
			System.out.println("0退出   1添加  2修改  3删除  4查询   5打印列表 ");
			int k=sc.nextInt();
			switch (k) {
				case 0:	
					break ab;					
				case 1:
					addinfor();
					break;
				case 2:
					change();
					break;
				case 3:
					del();
					break;
				case 4:
					search();
					break;
				case 5:
					type();
					break;
					default:
						System.out.println("请输入正确指令");
			}
		}
	}
	
	//添加
	static void addinfor()
	{
		for(int i=0;i<SIZE;i++)
		{						
			if(list[i][0]==null)	
			{
				System.out.println("输入姓名：");
				list[i][0]=sc.next();
				System.out.println("输入地址：");
				list[i][1]=sc.next();
				System.out.println("输入手机号：");
				list[i][2]=sc.next();
				System.out.println("输入QQ号：");
				list[i][3]=sc.next();				
				System.out.println("任意数字继续   退出：0");
				q=sc.nextInt();
				if(q==0)
				{break;}
				else {;}
			}
		}
	}
		//打印学生信息
	static void type()
	{
		for(int i=0;i<list.length;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(list[i][j]+"    ");
			}System.out.println();
		}
	}
//	//修改学生信息
	static void change()
	{
		
		System.out.println("选择需要修改人姓名");
		String i=sc.next();
		for(int a=0;a<list.length;a++)
		{	
			if(list[a][0].equals(i))
			{
				System.out.println("选择需要修改的信息：0姓名 1地址  2手机号  3QQ号");			
				int j=sc.nextInt();
				System.out.println("修改为：");
				String c=sc.next();
				list[a][j]=c;
				System.out.println("修改完成");
				break;
			}
		}
	}	
//	//删除学生信息
	static void del()
	{
		System.out.println("选择需要删除人姓名");
		String i=sc.next();
		for(int j=0;j<list.length;j++)
		{
			if(list[j][0].equals(i))
			{
				for(int d=0;d<4;d++) 
				{
					list[j][d]=null;
				}break ;
			}
		}
		System.out.println("删除完成");
	}
//	//查询
	static void search()
	{
		System.out.println("选择需要查询人姓名");
		String i=sc.next();
		int j;
		
		for(j=0;j<list.length;j++)
		{
			if(list[j][0].equals(i))
			{
				for(int d=0;d<4;d++)
				{					
					System.out.print(list[j][d]+"  ");
					
				}break ;
			}
		
		}
		
		System.out.println();
	}

}

