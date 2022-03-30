public class Career
{
  public String jobTitle;
  public FinalPersonalityType pt1;
  public FinalPersonalityType pt2;
  
  public Career(String jt, FinalPersonalityType p1, FinalPersonalityType p2)
  {
	  jobTitle = jt;
	  pt1 = p1;
	  pt2 = p2;
	//a  a
  }
  
  public boolean checkMatch(FinalPersonalityType temp)
  {
	  if(temp == pt1 || temp == pt2)
		  return true;
	  else
		  return false;
  }
  
  public String getJobTitle()
  {
	  return jobTitle;
  }
  }
