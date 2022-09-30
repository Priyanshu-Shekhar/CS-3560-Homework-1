package iVote_Simulator;

/*
 * Priyanshu Shekhar
 * CS 3650 Object-Oriented Design and Programming
 * Homework 1
 * Professor Yu Sun
*/

import java.util.ArrayList;

// Question interface 
public interface Question {

	public String getQuestion(); 
	public ArrayList<String> getAnswers();
	
	public boolean choices();
	
	
}