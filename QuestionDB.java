package com.mrudula.o1;

import java.util.ArrayList;

//QuestionDB class manages a collection of questions
public class QuestionDB
{ 
	private ArrayList <Question> questionList;
	
	private QuestionFileService qfs;
	// Default constructor initializes the question database with predefined questions
	public QuestionDB() {
		super();
		qfs=new QuestionFileService();
		questionList=qfs.readQuestionFiles();
	}

	// Method to get a question at a specific index
	Question get(int index)
	{
		return questionList.get(index);
	}
	//Method to get the total number of questions
	int size()
	{
		return questionList.size();
	}
}
