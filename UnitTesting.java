 import static org.junit.Assert.*;

public class UnitTesting
{
	
public static void main(String[] args)
{
	
	Trait I = new Trait("Introversion", 1);
	Trait E = new Trait("Extraversion", 2);
	Trait N = new Trait("Intuition", 3);
	Trait S = new Trait("Sensing", 4);
	Trait T = new Trait("Thinking", 5);
	Trait F = new Trait("Feeling", 6);
	Trait J = new Trait("Judging", 7);
	Trait P = new Trait("Perceiving", 8);
	Trait HS = new Trait("Highly-Stressed", 9);
	Trait LS = new Trait("Low-Stressed", 10);

	
	FinalPersonalityType test = new FinalPersonalityType("test2",I,N,T,J,HS); 
	
	Career test1 = new Career("temp",test,test);
	
	assertTrue(test1.checkMatch(test));
	
}
	
}
