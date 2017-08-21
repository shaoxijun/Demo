package _99练习;
import java.net.*;
import java.io.*;
public class Client
{

	public static void main(String[] args) throws UnknownHostException, IOException
	{
		// TODO Auto-generated method stub
		// 1. 创建socket
		String host = "127.0.0.1";
		int port = 8888;
		Socket s =new Socket(host,port);
		
		// 2. 连接数据库，和数据库进行通信
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();
		
		// 2.1 读取服务器发来信息
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		String str = new String(buf,0,len);
		System.out.println("server:"+str);
		
		// 2.2 向服务器发信息
		out.write("你好，我是小明".getBytes());		
		
		// 3. 关闭连接
		s.close();
	}

}
