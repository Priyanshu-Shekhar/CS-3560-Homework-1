package iVote_Simulator;

/*
 * Priyanshu Shekhar
 * CS 3650 Object-Oriented Design and Programming
 * Homework 1
 * Professor Yu Sun
*/

import java.util.Map;
import java.util.TreeMap;

public class VotingService {

	//Map variable
	private Map<String, Integer> table = new TreeMap<String, Integer>();
	
	// Collects all the student answers and check for what choices was submitted and build a statistics chart accordingly.
	public void printCounter() 
	{
		//traverses collected
		for (String id : Student.returnCollected().keySet())
		{
			for (int i = 0; i < Student.returnCollected().get(id).size(); ++i)
			{
				if (!(table.containsKey(Student.returnCollected().get(id).get(i))))
				{
					table.put(Student.returnCollected().get(id).get(i), 1);
				}
				else
				{
					table.put(Student.returnCollected().get(id).get(i) , table.get(Student.returnCollected().get(id).get(i)) + 1);
				}
			}
		}
		
		// Print the statistics chart
		System.out.println(table);
	}
}