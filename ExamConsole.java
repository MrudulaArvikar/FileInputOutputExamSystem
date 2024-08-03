package com.mrudula.o1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//ExamConsole class represents the user interface for conducting exams
public class ExamConsole {
 private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 private QuestionDB qdb;

 // Default constructor initializes the ExamConsole with a QuestionDB
 public ExamConsole() {
     super();
     qdb = new QuestionDB();
 }

 // Display menu and get user choice
 int menu() throws NumberFormatException, IOException {
     int choice = 0;
     System.out.println("1. Start exam");
     System.out.println("2. Exit");
     System.out.println("Enter your choice");
     choice = Integer.parseInt(br.readLine());
     return choice;
 }

 // Start the exam
 public void start() throws NumberFormatException, IOException {
     while (true) {
         int choice = menu();
         switch (choice) {
             case 1: // Start exam
                 startExam();
                 break;
             case 2: // Exit
                 System.exit(0);
         }
     }
 }

 // Public method to start the exam
 public void startExam() throws IOException {
     int score = 0;
     int totalQuestions = qdb.size();

     // Iterate through each question
     for (int i = 0; i < totalQuestions; i++) {
         Question question = qdb.get(i);
         System.out.println("Question " + (i + 1) + ":");
         System.out.println(question.getQ());
         System.out.println("Options:");
         System.out.println("a. " + question.getO1());
         System.out.println("b. " + question.getO2());
         System.out.println("c. " + question.getO3());
         System.out.println("d. " + question.getO4());
         System.out.print("Type your answer (a, b, c, d): ");
         String userAnswer = br.readLine();
         if (userAnswer.equalsIgnoreCase(question.getAnswer())) {
             System.out.println("Answer is correct");
             score++;
         } else {
             System.out.println("Wrong answer");
         }
         System.out.println("Your score: " + score + "/" + totalQuestions);
     }
 }
}