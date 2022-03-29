public class Response
{
  public PersonalityType type;
  public Question questionAnswered;
  public int scaledResponse;
  
  public Response(Question q, int sr)
  {
	  questionAnswered = q;
	  scaledResponse = sr;
	  
  }
  
  public Trait getDelta()
  {
	if(scaledResponse > 3)
	{
		return questionAnswered.getTrait2();
	}
	else if(scaledResponse < 3)
	{
		return questionAnswered.getTrait1();
	}
	else
	{
		return questionAnswered.getTrait1();
	}
  }
  
  public int getWeight()
  {
	  int w = questionAnswered.getQWeight();
	  //formula for calculating total score towards personality type here
	  return w;
  }
  }
  
