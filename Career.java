public class Career
{
  public String jobTitle;
  public FinalPersonalityType pt1;
  public FinalPersonalityType pt2;
  
  // Constructor
  
  public Career(String jt, FinalPersonalityType p1, FinalPersonalityType p2)
  {
	  jobTitle = jt;
	  pt1 = p1;
	  pt2 = p2;
  }
  
  // Checks to see if a personality type is linked to this Career
  
  public boolean checkMatch(FinalPersonalityType temp)
  {
	  if(temp == pt1 || temp == pt2)
		  return true;
	  else
		  return false;
  }
  
  // Returns job title to be printed at the end of the program
  
  public String getJobTitle()
  {
	  return jobTitle;
  }
  }
