package com.chinsys.byteStreams;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class bufferInputDemo {

	public static void main(String[] args) {
String s="99% is &approx equal to 100 but this &approx; not equal to 95";
byte buf[]=s.getBytes();
ByteArrayInputStream in =new ByteArrayInputStream(buf);
BufferedInputStream f =new BufferedInputStream(in);
	int c;
	try
	{
		while((c=f.read())!=-1)
		{
			System.out.println((char)c);
		}
	}catch(IOException ex)
	{
		ex.printStackTrace();
	}
	}
}