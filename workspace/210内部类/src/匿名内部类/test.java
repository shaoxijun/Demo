package �����ڲ���;

public class test
{
	public static void main(String[] args)
	{	
			// 1. ����һ��ְԱ�ĳ�����
			// ����һ�����󷽷� void work
			// ����һ��ҵ��Ա�����࣬��ְԱ�̳У�����work�������� 
			// ʵ�ַ���work()  ��ӡ���: ��ȥ��ҵ����!
			// ����һ������Ա�����࣬��������������
			// ʵ�ַ���work()  ��ӡ���: ��ʼ�������!
			// ����һ���߻������࣬��������������
			// ʵ�ַ���work()  ��ӡ���: ��ʼд�߻��ĵ���!
			abstract class Clerk
			{
				abstract void work();
			}
			Clerk saleMan = new Clerk()
					{
						@Override
						void work()
						{
							System.out.println("��ȥ��ҵ������");
						}						
					};
				saleMan.work();	
			new Clerk()
					{
						@Override
						void work()
						{
							System.out.println("��Ҫ�ô����ˣ�");
						}
				
					}.work();;
			Clerk plane = new Clerk()
					{

						@Override
						void work()
						{
							System.out.println("��ʼд�߻��ĵ���!");
						}				
					};
					plane.work();
	}
}
