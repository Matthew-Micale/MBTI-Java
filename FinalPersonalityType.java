// FinalPersonalityType is based on one of two Traits from each sphere
// There are a total of 32 FinalPersonalityTypes

public class FinalPersonalityType
{
  
  public String name;
  public Trait sphere1;
  public Trait sphere2;
  public Trait sphere3;
  public Trait sphere4;
  public Trait sphere5;
  
  // Constructor
  
  public FinalPersonalityType(String n, Trait s1, Trait s2, Trait s3, Trait s4, Trait s5)
  {
	  name = n;
	  sphere1 = s1;
	  sphere2 = s2;
	  sphere3 = s3;
	  sphere4 = s4;
	  sphere5 = s5;
  }
  
}
