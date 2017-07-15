
public class Round
{

	// 5. 定义一个Round类
			// 特性: 中心点坐标x,y 半径
			// 方法: 提供返回 周长 和圆面积的方法
	int r;
	double round()
	{
		 double R = 2*r*3.14f;
		 return R;
	}
	 double area()
	 {
		 double A = 3.14f*r*r;
		 return A;
	 }

}
