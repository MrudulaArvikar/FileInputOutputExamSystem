package com.mrudula.o1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String fileName=".\\question\\q1.txt"; // . means current folder, .. means parent folder
			try {
			BufferedReader br = new BufferedReader(new
			FileReader(fileName));
			String s="", ss="";
			while( (s=br.readLine())!=null)
			{
			ss=ss+s+"\n";
			}//while
			// System.out.println(ss);
			Question qu = getQuestion(ss);
			} 
			catch (FileNotFoundException e) 
			{
			System.out.println(e);
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} 
			}
			static Question getQuestion (String ss)
			{
			Question qu;
			int pos1=ss.indexOf("#");
			int pos2=ss.indexOf("#",pos1+1);
			int pos3=ss.indexOf("#",pos2+1);
			int pos4=ss.indexOf("#",pos3+1);
			int pos5=ss.indexOf("#",pos4+1);
			String q = ss.substring(0,pos1);
			String o1 = ss.substring(pos1+1,pos2);
			String o2 = ss.substring(pos2+1,pos3);
			String o3 = ss.substring(pos3+1,pos4);
			String o4 = ss.substring(pos4+1,pos5);
			String answer = ss.substring(pos5+1);
			qu = new Question(q, o1, o2, o3, o4, answer);
			qu.display();
			return qu;
			}

	

}
