package _1Integer;


public class testdemo
{
	public static void main(String[] args)
	{
				// 3. �����Integer���󱣴�32ջ�ƵĿ������.
				// Integer ��Ӧ����int ռ���ڴ���4���ֽڣ���32��������λ
				// ÿ��2����λ������2��״̬�������Ա�ʾ32ջ�ƵĿ���״̬��
				// �����ж���ջ������(����api,��һ���ķ�����ֱ��ʹ��)		
				Integer d = new Integer(1);
				System.out.println(d);
				Integer.bitCount(d);
				System.out.println(Integer.bitCount(d));
				// 4. �ۺ���ϰ:
				// ��дһ��LightManager�����32վջ�ƵĿ���.
				// ����ʹ��һ��Integer������32ջ�Ƶ�״̬
				// �����´������:
//				LightManager lm = new LightManager();
//				lm.print();// ��� 00000000000000000000000000000000
//				// �����е�
//				lm.openAll();
//				lm.print();// ��� 11111111111111111111111111111111
//				// �رյ�8ջ��
//				lm.close(8);
//				lm.print();// ��� 11111110111111111111111111111111
//				// �رյ�10 12 14 16ջ�� (ʹ�ÿɱ��������)
//				lm.close(10,12,14,16);
//				lm.print();// ��� 11111110101010101111111111111111
//				// �����ĵƹص����صĵƴ�
//				lm.reverse();
//				lm.print();// ��� 00000001010101010000000000000000
//				// �򿪵�31 32յ��
//				lm.open(31,32);
//				lm.print();// ��� 00000001010101010000000000000011
//				// ��ӡ���ŵƵ�����
//				System.out.println(lm.getOpenCount());// ��� 7 
//				// ��ӡ��10յ�ƵĿ���״̬
//				System.out.println(lm.isOpen(10));// ��� true
				
	}
}
