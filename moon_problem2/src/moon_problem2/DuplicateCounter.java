package moon_problem2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {
	
	// storing unique words in this variable
	Map<String, Integer> uniqueWords = new HashMap<String, Integer>();
	
	public void count(String dataFile)
	{
		Scanner scanner = null;
		try 
		{
			File newFile = new File(dataFile);
			// opening scanner
			scanner = new Scanner(newFile);
			// stepping through file and storing each unique word in uniqueWords
			while(scanner.hasNext())
			{
				String uniqueWord = scanner.next();
				uniqueWord = uniqueWord.toLowerCase();
				Integer count = uniqueWords.get(uniqueWord);
				if (count == null)
				{
					count = 1;
				}
				else
				{
					count++;
				}
				uniqueWords.put(uniqueWord, count);

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
	    	
			for (String uniqueWord1 : uniqueWords.keySet())  
			{
			   String data = String.format("Word: %-10s Count: %s\n", uniqueWord1, uniqueWords.get(uniqueWord1));
			   writing.write(data);
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
