package _99练习;

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

		System.out.print("请输入一个完整的网址(如http://www.baidu.com):");
		Scanner sc = new Scanner(System.in);
		String urlStr = sc.next();
		String str = getHtmlString(urlStr);// 获取网址网页数据
		System.out.println(str);

		// 1. 使用正则表达式把网页的标题解析出来
		// 即：<title>网页标题</title>
		// <title>百度一下，你就知道</title>
		Pattern pa = Pattern.compile("<title>百度一下，你就知道</title>");
		Matcher ma = pa.matcher(str);
		if(ma.find())
		{
			System.out.println(ma.group());
		}
		// * 2. 解析网页中所有的链接及对应的文字
		// 如: <a href=http://v.baidu.com name=tj_trvideo class=mnav>视频</a>
		// 链接地址:http://v.baidu.com
		// 链接文字:视频
		
		
		

	}

}
