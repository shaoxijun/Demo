package _99��ϰ;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex
{

	public static String getHtmlString(String urlStr) throws Exception
	{
		URL url = new URL(urlStr);
		StringBuffer sb = new StringBuffer();
		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), "utf-8"));
		String tmp;
		while ((tmp = in.readLine()) != null)
		{
			sb.append(tmp);
			sb.append("\r\n");
		}
		in.close();
		return sb.toString();
	}

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub

		System.out.print("������һ����������ַ(��http://www.baidu.com):");
		Scanner sc = new Scanner(System.in);
		String urlStr = sc.next();
		String str = getHtmlString(urlStr);// ��ȡ��ַ��ҳ����
		System.out.println(str);

		// 1. ʹ��������ʽ����ҳ�ı����������
		// ����<title>��ҳ����</title>
		// <title>�ٶ�һ�£����֪��</title>
		Pattern pa = Pattern.compile("<title>�ٶ�һ�£����֪��</title>");
		Matcher ma = pa.matcher(str);
		if(ma.find())
		{
			System.out.println(ma.group());
		}
		// * 2. ������ҳ�����е����Ӽ���Ӧ������
		// ��: <a href=http://v.baidu.com name=tj_trvideo class=mnav>��Ƶ</a>
		// ���ӵ�ַ:http://v.baidu.com
		// ��������:��Ƶ
		
		
		

	}

}
