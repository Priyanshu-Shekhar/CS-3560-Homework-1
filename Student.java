package iVote_Simulator;

/*
 * Priyanshu Shekhar
 * CS 3650 Object-Oriented Design and Programming
 * Homework 1
 * Professor Yu Sun
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class Student {

	//variables
	private String studentID;
	private ArrayList<String> answer;
	private static HashMap<String, ArrayList<String>> collectAnswer = new HashMap<String, ArrayList<String>>();
	
	//unique Student ID
	public Student(String id)
	{
		this.studentID = id;
	}
	
	public String getId()
	{
		return studentID;
	}
	
	//Student randomly submit their answers based on whether it is MCQ or single-choice question
	public ArrayList<String> submitAnswer(Question question) 
	{
		//True for single choice question , false for multiple choice question
		if (question.choices())
		{
			answer = new ArrayList<String>(question.getAnswers());
			Collections.shuffle(answer);
			answer.remove(0);
			collectAnswer.put(getId(), answer);
		}

		else if(!(question.choices()))
		{
			answer = new ArrayList<String>(question.getAnswers());
			Collections.shuffle(answer);
			for (int i = answer.size() - 1; i > (int)(new Random().nextInt(answer.size()) + 1); i--)
			{
				answer.remove(i);
			}
			
			for (int i = 0; i < answer.size(); ++i)
			{
				if (answer.get(i) != null)
				{
					collectAnswer.put(getId(), answer);
				}
			}
		}
		Collections.sort(answer);
		return answer;
	}
	// answers are stored in ArrayList
	public ArrayList<String> getAnswer() {
		return answer;
	}
	
	public static HashMap<String, ArrayList<String>> returnCollected() 
	{
		return collectAnswer;
	}
}