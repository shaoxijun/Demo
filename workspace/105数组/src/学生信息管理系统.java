import java.util.Scanner;

public class ѧ����Ϣ����ϵͳ
{

	static int[][] exls=new int[10][4];
	static Scanner sc=new Scanner(System.in);	
	static int q;
	public static void main(String[] args)
	{
		while(true) 
		{
			System.out.println("0���ѧ����Ϣ   1��ӡѧ����Ϣ  2�޸�ѧ���ɼ�  3ɾ��ѧ���ɼ�  4��ѯѧ���ɼ�  5��ѯ����ѧ��");
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
						System.out.println("��������ȷָ��");
			}
		}
	}
	
	//���ѧ����Ϣ
	static void addinfor()
	{
		for(int i=0;i<exls.length;i++)
		{						
			if(exls[i][0]==0)	
			{
				System.out.println("����ѧ�ţ�");
				exls[i][0]=sc.nextInt();
				System.out.println("����Ӣ��ɼ���");
				exls[i][1]=sc.nextInt();
				System.out.println("������ѧ�ɼ���");
				exls[i][2]=sc.nextInt();
				System.out.println("�������ĳɼ���");
				exls[i][3]=sc.nextInt();				
				System.out.println("�������ּ���   �˳���0");
				q=sc.nextInt();
				if(q==0)
				{break;}
				else {;}
			}
		}
	}
		//��ӡѧ����Ϣ
	static void type()
	{
		System.out.println("ѧ��   Ӣ��      ��ѧ     ����");
		for(int i=0;i<exls.length;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(exls[i][j]+"    ");
			}System.out.println();
		}
	}
	//�޸�ѧ����Ϣ
	static void change()
	{
		
		System.out.println("ѡ����Ҫ�޸ĵ�ѧ����ѧ��");
		int i=sc.nextInt();
		for(int a=0;a<exls.length;a++)
		{	
			if(exls[a][0]==i)
			{
				System.out.println("ѡ����Ҫ�޸ĵ���Ϣ��0ѧ�� 1Ӣ��  2��ѧ  3����");			
				int j=sc.nextInt();
				System.out.println("�޸�Ϊ��");
				int c=sc.nextInt();
				exls[a][j]=c;
				System.out.println("�޸����");
				break;
			}
		}
	}	
	//ɾ��ѧ����Ϣ
	static void del()
	{
		System.out.println("ѡ����Ҫɾ����ѧ����ѧ�ź�");
		int i=sc.nextInt();
		for(int j=0;j<exls.length;j++)
		{
			if(exls[j][0]==i)
				for(int d=0;d<4;d++) 
				{
					exls[j][d]=0;
				}
		}
		System.out.println("ɾ�����");
	}
	//��ѯĳ��ѧ�ŵĳɼ�
	static void search()
	{
		System.out.println("ѡ����Ҫ��ѯ��ѧ����ѧ��");
		int i=sc.nextInt();
		System.out.println("ѧ��   Ӣ��   ��ѧ  ����");
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
	//��ѯ��Ҫ������ѧ��
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
						System.out.println(exls[i][0]+"Ӣ����Ҫ����");
						}
						else if(j==2)
						{
						System.out.println(exls[i][0]+"��ѧ��Ҫ����");
						}
						else if(j==3)
						{
						System.out.println(exls[i][0]+"������Ҫ����");
						}
					}
				}
			}
		}
	}
	
}
