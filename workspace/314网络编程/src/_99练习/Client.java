package _99��ϰ;
import java.net.*;
import java.io.*;
public class Client
{

	public static void main(String[] args) throws UnknownHostException, IOException
	{
		// TODO Auto-generated method stub
		// 1. ����socket
		String host = "127.0.0.1";
		int port = 8888;
		Socket s =new Socket(host,port);
		
		// 2. �������ݿ⣬�����ݿ����ͨ��
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();
		
		// 2.1 ��ȡ������������Ϣ
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		String str = new String(buf,0,len);
		System.out.println("server:"+str);
		
		// 2.2 �����������Ϣ
		out.write("��ã�����С��".getBytes());		
		
		// 3. �ر�����
		s.close();
	}

}
