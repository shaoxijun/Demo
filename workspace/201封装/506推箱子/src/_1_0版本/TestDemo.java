package _1_0�汾;

import java.util.Arrays;

// 1. 

public class TestDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		// �õ���һ�صĹؿ���Ϣ
		BoxTools.getAnswer(1, 1);
		// �����λ��:
		System.out.println("�����ʼ����:"+BoxTools.initboyx+","+BoxTools.initboyy);
		// ��ͼ��Ϣ�� BoxTools.map_iv�����ά������
		System.out.println("��ͼ��Ϣ:");
		for(int i=0;i<BoxTools.map_iv.length;i++)
		{
			System.out.println(Arrays.toString(BoxTools.map_iv[i]));
		}
	}

}
