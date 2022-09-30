package iVote_Simulator;

/*
 * Priyanshu Shekhar
 * CS 3650 Object-Oriented Design and Programming
 * Homework 1
 * Professor Yu Sun
*/

import java.util.ArrayList;

public class SingleChoiceQuestion implements Question {

	//Variables
	private String question;
	private ArrayList<String> answerChoice;
	
	//Constructor for multiple choice question class
	public SingleChoiceQuestion(String question, ArrayList<String> answerChoice)
	{
		this.question = question;
		this.answerChoice = answerChoice;
	}
	
	// decides whether it is a MCQ or single-choice question
	public boolean choices() {
		return true;
	}
	
	// Get single-choice questions
	public String getQuestion() {
		System.out.println("This is a single-choice question:");
		return this.question;
	}
	//Get single answers from the students
	public ArrayList<String> getAnswers()
	{
		return this.answerChoice;
	}
}