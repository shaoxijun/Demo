
public class Rectangle
{
	// 6. 定义一个Rectangle类 (长方形类)
			// 特性: 左上角坐标x,y 宽width 高 height
			// 方法: 提供返回 周长和面积的方法
	int width;
	int height;
	int round()
	{
		 int R = 2*(width+height);
		 return R;
	}
	 int area()
	 {
		 int A = width*height;
		return A;
	 }
}
