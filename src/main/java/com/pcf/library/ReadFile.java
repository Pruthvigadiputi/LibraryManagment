package com.pcf.library;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
	
	public StringBuffer readFile(String fileName) throws IOException
	{
		FileReader fileReader=new FileReader(fileName);
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		String s;
		while((s = bufferedReader.readLine()) != null)
		{
			
		}
		return null;
		
	}
	
	public ArrayList<Object> dataSplitior(String s,String fileNAme)
	{
		
	}

}
