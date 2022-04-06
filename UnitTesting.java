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
	
	Question test3 = new Question("testing 1,2,3",10,I,E);
	
	assertEquals(test3.getText(),"testing 1,2,3");
	
	PersonalityType test4 = new PersonalityType();
	
	test4.addResponse(1, 10);
	
	assertEquals(test4.getScore(1),10.0,0);
	
	Response test5 = new Response(test3,5);
	
	assertEquals(test5.getWeight(),10,0);
	
	Career test6 = new Career("temp2",null,null);
	
	assertFalse(test6.checkMatch(test));
	
	assertEquals(I.getId(),1);
	
	assertEquals(test3.getTrait1(),I);
	
	assertEquals(test3.getTrait2(),E);
	
	assertEquals(test3.getQWeight(),10);
	
}
	
}
