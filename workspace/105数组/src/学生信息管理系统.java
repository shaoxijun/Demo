import java.util.Scanner;

public class 学生信息管理系统
{

	static int[][] exls=new int[10][4];
	static Scanner sc=new Scanner(System.in);	
	static int q;
	public static void main(String[] args)
	{
		while(true) 
		{
			System.out.println("0添加学生信息   1打印学生信息  2修改学生成绩  3删除学生成绩  4查询学生成绩  5查询补考学生");
			int k=sc.nextInt();
			switch (k) {
				case 0:
					addinfor();
					break;
				case 1:
					type();
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
					bukao();
					break;
					default:
						System.out.println("请输入正确指令");
			}
		}
	}
	
	//添加学生信息
	static void addinfor()
	{
		for(int i=0;i<exls.length;i++)
		{						
			if(exls[i][0]==0)	
			{
				System.out.println("输入学号：");
				exls[i][0]=sc.nextInt();
				System.out.println("输入英语成绩：");
				exls[i][1]=sc.nextInt();
				System.out.println("输入数学成绩：");
				exls[i][2]=sc.nextInt();
				System.out.println("输入语文成绩：");
				exls[i][3]=sc.nextInt();				
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
		System.out.println("学号   英语      数学     语文");
		for(int i=0;i<exls.length;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(exls[i][j]+"    ");
			}System.out.println();
		}
	}
	//修改学生信息
	static void change()
	{
		
		System.out.println("选择需要修改的学生的学号");
		int i=sc.nextInt();
		for(int a=0;a<exls.length;a++)
		{	
			if(exls[a][0]==i)
			{
				System.out.println("选择需要修改的信息：0学号 1英语  2数学  3语文");			
				int j=sc.nextInt();
				System.out.println("修改为：");
				int c=sc.nextInt();
				exls[a][j]=c;
				System.out.println("修改完成");
				break;
			}
		}
	}	
	//删除学生信息
	static void del()
	{
		System.out.println("选择需要删除的学生的学号号");
		int i=sc.nextInt();
		for(int j=0;j<exls.length;j++)
		{
			if(exls[j][0]==i)
				for(int d=0;d<4;d++) 
				{
					exls[j][d]=0;
				}
		}
		System.out.println("删除完成");
	}
	//查询某个学号的成绩
	static void search()
	{
		System.out.println("选择需要查询的学生的学号");
		int i=sc.nextInt();
		System.out.println("学号   英语   数学  语文");
		int j;
		for(j=0;j<exls.length;j++)
		{
			if(exls[j][0]==i)
			{
				for(int d=0;d<4;d++)
				{					
					System.out.print(exls[j][d]+"  ");
				}
			}
		
		}
		
		System.out.println();
	}
	//查询需要补考的学生
	static void bukao()
	{
		for(int i=0;i<exls.length;i++)
		{
			for(int j=1;j<4;j++)
			{
				if(exls[i][0]!=0)
				{
					if(exls[i][j]==0)
					{	
						if(j==1)
						{
						System.out.println(exls[i][0]+"英语需要补考");
						}
						else if(j==2)
						{
						System.out.println(exls[i][0]+"数学需要补考");
						}
						else if(j==3)
						{
						System.out.println(exls[i][0]+"语文需要补考");
						}
					}
				}
			}
		}
	}
	
}
