
import java.util.Scanner;

public class ͨѶ¼
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
			System.out.println("0�˳�   1���  2�޸�  3ɾ��  4��ѯ   5��ӡ�б� ");
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
						System.out.println("��������ȷָ��");
			}
		}
	}
	
	//���
	static void addinfor()
	{
		for(int i=0;i<SIZE;i++)
		{						
			if(list[i][0]==null)	
			{
				System.out.println("����������");
				list[i][0]=sc.next();
				System.out.println("�����ַ��");
				list[i][1]=sc.next();
				System.out.println("�����ֻ��ţ�");
				list[i][2]=sc.next();
				System.out.println("����QQ�ţ�");
				list[i][3]=sc.next();				
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
		for(int i=0;i<list.length;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(list[i][j]+"    ");
			}System.out.println();
		}
	}
//	//�޸�ѧ����Ϣ
	static void change()
	{
		
		System.out.println("ѡ����Ҫ�޸�������");
		String i=sc.next();
		for(int a=0;a<list.length;a++)
		{	
			if(list[a][0].equals(i))
			{
				System.out.println("ѡ����Ҫ�޸ĵ���Ϣ��0���� 1��ַ  2�ֻ���  3QQ��");			
				int j=sc.nextInt();
				System.out.println("�޸�Ϊ��");
				String c=sc.next();
				list[a][j]=c;
				System.out.println("�޸����");
				break;
			}
		}
	}	
//	//ɾ��ѧ����Ϣ
	static void del()
	{
		System.out.println("ѡ����Ҫɾ��������");
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
		System.out.println("ɾ�����");
	}
//	//��ѯ
	static void search()
	{
		System.out.println("ѡ����Ҫ��ѯ������");
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

