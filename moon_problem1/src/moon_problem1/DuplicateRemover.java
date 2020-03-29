package moon_problem1;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover 
{
	
	// storing unique words in this variable
	Set<String> uniqueWords = new HashSet<>();
	
	public void remove(String dataFile)
	{
		Scanner scanner;
		try 
		{
			File newFile = new File(dataFile);
			// opening scanner
			scanner = new Scanner(newFile);
			
			// stepping through file and storing each unique word in uniqueWords
			while(scanner.hasNext())
			{
				String word = scanner.next();
				word = word.toLowerCase();
				uniqueWords.add(word + "\n");
			}
			// closing scanner
			scanner.close();
		} catch (IOException exception) 
		  {
			// print out error message 
			System.out.println("Error: Sorry an IO error occurred. Exiting the program, Goodbye!");
			// close program
			System.exit(0);
		  }
	}
	
	
	public void write(String outputFile)
	{
	    try 
	    {
	    	File newFile = new File(outputFile);
	    	FileWriter writing = new FileWriter(newFile);
	    	
	    	for (String wordToWrite : uniqueWords)
	    	{
	    		writing.write(wordToWrite);
	    	}
	    	writing.close();
	    } catch (IOException exception) 
	        {
	    	  // print out error message 
	    	  System.out.println("Error: Sorry an IO error occurred. Exiting the program, Goodbye!");
	    	  // close program
	    	  System.exit(0);	    	  
	        }
	}

}
