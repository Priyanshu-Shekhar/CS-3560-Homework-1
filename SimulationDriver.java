package iVote_Simulator;

/*
 * Priyanshu Shekhar
 * CS 3650 Object-Oriented Design and Programming
 * Homework 1
 * Professor Yu Sun
*/

import java.util.ArrayList;
import java.util.Random;

public class SimulationDriver {
	
	public static void main(String[] args)
	{	
		//Multiple Choice Question
		System.out.println("");
		System.out.println("Program randomly chooses between single-choice question and multiple-choice question.");
		System.out.println("");
		
		//Multiple Choice Question Output
		String question = "What is Water?";
		ArrayList<String> answerList = new ArrayList<String>();
		answerList.add("A. H20");
		answerList.add("B. Ice");
		answerList.add("C. Steam");
		answerList.add("D. Fluid");
		Question multipleQuestion = new MultipleChoiceQuestion(question, answerList);
		
		//Single Choice Question Output
		String question2 = "What do you want?";
		ArrayList<String> answerList2 = new ArrayList<String>();
		answerList2.add("Good Grades");
		answerList2.add("Good Mental Health");
		Question singleQuestion = new SingleChoiceQuestion(question2, answerList2);
		
		Question type[] = new Question[2];
		Question questionChoice;
		type[0] = multipleQuestion; 
		type[1] = singleQuestion;
		questionChoice = type[(int)(new Random().nextInt(2))];
		System.out.println("Question = " + questionChoice.getQuestion());
		
		//Initialization for VoteService method
		VotingService iVote = new VotingService();
		
		//Generate list of students and their answers
		int randomSize = (int)(new Random().nextInt(30) + 2);
		Student student[] = new Student[randomSize];
		
		//Send answers to VoteingService class for results
		int randomStudents = (int)(new Random().nextInt(randomSize));
		int randomNumber;
		
		//Output the student answers and the statistics chart
		System.out.println("\nResults: ");
		System.out.println("The student can resubmit the answer but their last answer is taken.\n");
		
		for (int i = 0; i < student.length; ++i)
		{
			student[i] = new Student("#" + i);
		}
			
		for (int i = 0; i < randomStudents; ++i)
		{
			randomNumber = (int)(new Random().nextInt(randomStudents));
			student[randomNumber].submitAnswer(questionChoice);
			System.out.println("Student ID " + student[randomNumber].getId() + "  -  Answer: " + student[randomNumber].getAnswer());
		}
		
		//Print results
		System.out.println( "\n" + "Statistics of each option:");
		iVote.printCounter();
		System.out.print( "\n");
	}
}