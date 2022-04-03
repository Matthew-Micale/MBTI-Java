// A class that formats all Question objects

public class Question
{
  
	public String text;
	public int weight;
	public Trait trait1;
	public Trait trait2;

// Constructor	
	
	public Question(String t, int w, Trait t1, Trait t2)
	{
		
		text = t;
		weight = w;
		trait1 = t1;
		trait2 = t2;
	}

// The Trait linked to an answer from 1-3	
	
	public Trait getTrait1()
	{
		return trait1;
	}

// The Trait linked to an answer from 3-5	
	
	public Trait getTrait2()
	{
		return trait2;
	}

// How much the Question is weighted for calculating its respective Trait	
	
	public int getQWeight()
	{
	return weight;
}
	
// Returns Question text for printing to console
	
	public String getText()
	{
		return text;
	}
}
