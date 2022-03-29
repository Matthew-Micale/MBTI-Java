public class Question
{
  
	public String text;
	public int weight;
	public Trait trait1;
	public Trait trait2;
	
	public Question(String t, int w, Trait t1, Trait t2)
	{
		
		text = t;
		weight = w;
		trait1 = t1;
		trait2 = t2;
	}
	
	public Trait getTrait1()
	{
		return trait1;
	}
	
	public Trait getTrait2()
	{
		return trait2;
	}
	
	public int getQWeight()
	{
	return weight;
}
	public String getText()
	{
		return text;
	}
}
