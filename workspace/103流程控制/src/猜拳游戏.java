import java.util.Scanner;

public class ��ȭ��Ϸ
{

	public static void main(String[] args)
	{
//		1. ��дһ����ȭ��Ϸ
		// ����ʹ�����������ȭ
		// ��ҳ�ȭ����������� 0 1 2
		// ��ҽ�������ѡ����Ϸģʽ
		// ģʽ1 ������20�� (��for) 
		// ģʽ2 ����һֱ�浽��20��Ϊֹ(��while����dowhile�ʺ�)
		// ��Ϸ������ͳ����Ӯƽ�ִ���
		// ��Ϸ��������ʾ��ҵĻ���(Ӯ�ô���*10)  	
		// (��ʾ: �����1�ֲ�ȭ��Ϸ��Ȼ���ټ�����๦��)
		// 1. ��ҳ�ȭ
		// 2. ���Գ�ȭ
		// 3. ��ʾ��Ӯ���
		Scanner sc=new Scanner(System.in);
		System.out.println("��ѡ����Ϸģʽ1��2��");
		int moshi=sc.nextInt();
		System.out.println("���ѽ���ģʽ"+moshi);
		int moshi1=0;
		int moshi2=0;
		if(moshi==1){moshi1=1;}
		if(moshi==2){moshi2=1;}
		int shu=0,ying=0,ping=0,jifen=0;	
		for(int i=0;i<=19;i++)
		{	
			
			System.out.print("����������0ʯͷ��1������2����");
			int player=sc.nextInt();					
			int computer=(int)(3*Math.random());
			if(player==0) {System.out.print("�ҳ�����ʯͷ��");}
			else if(player==1) {System.out.print("�ҳ����Ǽ�����");}
			else if(player==2) {System.out.print("�ҳ����ǲ���");}
			else {System.out.println("����������Ϸ������������0~2��");break;}
			if(computer==0) {System.out.print("���Գ�����ʯͷ��");}
			else if(computer==1) {System.out.print("���Գ����Ǽ�����");}
			else if(computer==2) {System.out.print("���Գ����ǲ���");}
			if(player==computer) {ping++;System.out.println("��������ƽ��");}	
			else if(player==0&computer==1||player==1&computer==2)
			{
				ying++;
				jifen=ying*10;
				System.out.println("���������Ӯ��");				
			}
			else if(player==0&computer==2||player==1&computer==0)
			{
				shu++;
				System.out.println("���ź���������");
			}						
			if(moshi2==1&shu==2)
			{				
				break;
			}
		}
		System.out.println("Ӯ��"+ying+"�Σ�"+"����"+shu+"�Σ�"+"ƽ��"+ping+"�Σ�"
							+"����Ϊ��"+jifen);		
			
		
	}	
}


