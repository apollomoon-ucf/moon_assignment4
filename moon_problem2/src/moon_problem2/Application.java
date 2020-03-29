package moon_problem2;

public class Application {

	public static void main(String[] args) 
	{
		DuplicateCounter dupRem = new DuplicateCounter();
		dupRem.count("problem2.txt");
		dupRem.write("unique_word_counts.txt");		
	}

}
