import java.util.Scanner;

public class RPG
{
	// 7. һ��N*N��ͼ��RPG��Ϸ 
			// ����һ����ά��ͼRPG��Ϸ��Ӣ����
			// ����:
			// ����
			// �ڵ�ͼ�ϵ����� x y (��Χ��0~N-1,��ͼ��СN*N)
			// HP,MaxHP
			// MP,MaxHP
			// ����:
			// ��ӡӢ�۵���Ϣ 
			// ��ĳ�������ƶ�
			//  ���뷽��Ȼ������ƶ������޸�Ӣ������
			// 	(�� y--,��y++ ,��x--,��x++)�������߳���ͼ
	Scanner sc = new Scanner(System.in);
	int SIZE = 10;
	String property;
	int[][] map = new int[SIZE][SIZE];
	String name;
	int x,y;
	int HP,MP,MaxHP,MaxMP;
	void information()
	{
		System.out.println("���ԣ�"+property+"  ����"+name+"  HP:"+HP+"  MP��"+MP+"  MaxHP��"+MaxHP+"  MaxMP��"+MaxMP);
		
	}
	void direction()
	{
		System.out.println("8 2 4 6�ֱ��ʾ�� �� �� �� ����ѡ����Ҫ�Ĳ���");
		int i = sc.nextInt();
		if(x>=0&&x<=SIZE&&y>=0&&y<=SIZE)
		{	
		switch (i)
		{
			case 8:
				x++;
				break;
			case 2:
				x--;
				break;
			case 4:
				y--;
				break;
			case 6:
				y++;
				break;
			default:
				System.out.println("�������");
				
		}
		}
	}
	
}
