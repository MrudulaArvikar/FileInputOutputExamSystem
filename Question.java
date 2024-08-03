package com.mrudula.o1;

//Question class represents a single question with its options and correct answer
public class Question {
 private String q, o1, o2, o3, o4, answer;
 
 // Default constructor
 public Question() {
     super();
 }

 // Parameterized constructor
 public Question(String q, String o1, String o2, String o3, String o4, String answer) {
     super();
     this.q = q;
     this.o1 = o1;
     this.o2 = o2;
     this.o3 = o3;
     this.o4 = o4;
     this.answer = answer;
 }

 // Getter and setter methods for question, options, and answer
 public String getQ() {
     return q;
 }

 public void setQ(String q) {
     this.q = q;
 }

 public String getO1() {
     return o1;
 }

 public void setO1(String o1) {
     this.o1 = o1;
 }

 public String getO2() {
     return o2;
 }

 public void setO2(String o2) {
     this.o2 = o2;
 }

 public String getO3() {
     return o3;
 }

 public void setO3(String o3) {
     this.o3 = o3;
 }

 public String getO4() {
     return o4;
 }

 public void setO4(String o4) {
     this.o4 = o4;
 }

 public String getAnswer() {
     return answer;
 }

 public void setAnswer(String answer) {
     this.answer = answer;
 }

 
 public void display() {
	 System.out.println(q);
	 System.out.println("(A)-->"+o1);
	 System.out.println("(B)-->"+o2);
	 System.out.println("(C)-->"+o3);
	 System.out.println("(D)-->"+o4);
 }

}