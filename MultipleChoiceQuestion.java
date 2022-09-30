package iVote_Simulator;

/*
 * Priyanshu Shekhar
 * CS 3650 Object-Oriented Design and Programming
 * Homework 1
 * Professor Yu Sun
*/

import java.util.ArrayList;


public class MultipleChoiceQuestion implements Question {

	//Variables
	private String question; 
	private ArrayList<String> answerChoice;
	
	//Constructor for multiple choice question class
	public MultipleChoiceQuestion(String question, ArrayList<String> answerChoice)
	{

		this.question = question;
		this.answerChoice = answerChoice;
	}
	
	// decides whether it is a MCQ or single-choice question
	public boolean choices() {
		return false;
	}
	
	// Get multiple-choice questions
	public String getQuestion() {
		System.out.println("This is a multiple-choice question:");
		return this.question;
	}

	//Get multiple answers from the students
	public ArrayList<String> getAnswers() {
		return this.answerChoice;
	}	
}