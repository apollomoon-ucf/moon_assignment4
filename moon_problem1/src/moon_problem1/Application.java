package moon_problem1;

public class Application {

	public static void main(String[] args) 
	{
		DuplicateRemover dupRem = new DuplicateRemover();
		dupRem.remove("problem1.txt");
		dupRem.write("unique_words.txt");
	}

}
