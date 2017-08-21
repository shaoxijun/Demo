package _99练习;
import java.net.*;
import java.io.*;
public class Server
{

	
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		// 1. 创建服务
		int port = 8888;
		ServerSocket serSocket = null;
		serSocket = new ServerSocket(port);

		// 2. 监听服务
		System.out.println("开启服务器,监听" + port + "端口,等待客户端连接");
		Socket cs = serSocket.accept();
		
		// 3. 客户连接了和客户端通信
		System.out.println("客户端连上了");
		InputStream in = cs.getInputStream();
		OutputStream out = cs.getOutputStream();
		
		// 3.1 向客户端发消息
		out.write("你好!欢迎光临!".getBytes());
		
		// 3.2 接收客户端消息
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		String str = new String(buf,0,len);
		System.out.println("客户端:"+str);		

		// 4. 关闭连接
		System.out.println("关闭服务器socket");
		serSocket.close();
	}

}
