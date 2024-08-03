package com.mrudula.o1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class QuestionFileService {
	private String folderName=".\\question";
	ArrayList<Question>readQuestionFiles()
	{
		ArrayList <Question> questionList=new ArrayList<Question>();
		File f=new File(folderName);
		System.out.println("There are " +f.list().length+ "files");
		
		String files[]=f.list();
			String ss;
		for (int i = 0; i < files.length; i++) {
				ss=read(files[0]);
				Question qu=getQuestion(ss);
				questionList.add(qu);
		}
		return questionList;
	}
	String read(String fileName) {
		BufferedReader br=null;
		try {
			br = new BufferedReader(new FileReader(folderName+"\\"+fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				String s="", ss="";
				try {
					while( (s=br.readLine())!=null)
					{
					ss=ss+s+"\n";
					}
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//while
				return ss;
	}
	Question getQuestion (String ss)
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
	String answer = ss.substring(pos5+2,pos5+3);
	qu = new Question(q, o1, o2, o3, o4, answer);
	
	return qu;
	}
}
