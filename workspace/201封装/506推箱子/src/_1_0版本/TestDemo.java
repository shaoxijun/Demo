package _1_0版本;

import java.util.Arrays;

// 1. 

public class TestDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		// 得到第一关的关卡信息
		BoxTools.getAnswer(1, 1);
		// 人物的位置:
		System.out.println("玩家起始坐标:"+BoxTools.initboyx+","+BoxTools.initboyy);
		// 地图信息在 BoxTools.map_iv这个二维数组中
		System.out.println("地图信息:");
		for(int i=0;i<BoxTools.map_iv.length;i++)
		{
			System.out.println(Arrays.toString(BoxTools.map_iv[i]));
		}
	}

}
