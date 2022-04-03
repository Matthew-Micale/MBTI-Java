// A class that stores data for each Response

public class Response
{
  public PersonalityType type;
  public Question questionAnswered;
  public int scaledResponse;
  
 // Response constructor 
  
  public Response(Question q, int sr)
  {
	  questionAnswered = q;
	  scaledResponse = sr;	  
  }
  
 // Determines which Trait the Response points go towards 
  
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
 
 // Returns the weight of the Question answered 
  
  public int getWeight()
  {
	  int w = questionAnswered.getQWeight();
	  return w;
  }
  }
  
