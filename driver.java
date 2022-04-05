import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class driver

{

	public static void main(String[] args) throws IOException

	{
		// creates GUI files
		// GUI win = new GUI(640,480);
		// win.setupGUI();
		// win.setupButtonListeners();

// Instantiating all Traits

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

// Instantiating all FinalPersonalityTypes

		FinalPersonalityType INTJH = new FinalPersonalityType("INTJH", I, N, T, J, HS);
		FinalPersonalityType INTJL = new FinalPersonalityType("INTJL", I, N, T, J, LS);
		FinalPersonalityType INTPH = new FinalPersonalityType("INTJH", I, N, T, P, HS);
		FinalPersonalityType INTPL = new FinalPersonalityType("INTJL", I, N, T, P, LS);
		FinalPersonalityType INFJH = new FinalPersonalityType("INFJH", I, N, F, J, HS);
		FinalPersonalityType INFJL = new FinalPersonalityType("INFJL", I, N, F, J, LS);
		FinalPersonalityType INFPH = new FinalPersonalityType("INFPH", I, N, F, P, HS);
		FinalPersonalityType INFPL = new FinalPersonalityType("INFPL", I, N, F, P, LS);
		FinalPersonalityType ISTJH = new FinalPersonalityType("ISTJH", I, S, T, J, HS);
		FinalPersonalityType ISTJL = new FinalPersonalityType("ISTJL", I, S, T, J, LS);
		FinalPersonalityType ISTPH = new FinalPersonalityType("ISTPH", I, S, T, P, HS);
		FinalPersonalityType ISTPL = new FinalPersonalityType("ISTPL", I, S, T, P, LS);
		FinalPersonalityType ISFJH = new FinalPersonalityType("ISFJH", I, S, F, J, HS);
		FinalPersonalityType ISFJL = new FinalPersonalityType("ISFJL", I, S, F, J, LS);
		FinalPersonalityType ISFPH = new FinalPersonalityType("ISFPH", I, S, F, P, HS);
		FinalPersonalityType ISFPL = new FinalPersonalityType("ISFPL", I, S, F, P, LS);

		FinalPersonalityType ENTJH = new FinalPersonalityType("ENTJH", E, N, T, J, HS);
		FinalPersonalityType ENTJL = new FinalPersonalityType("ENTJL", E, N, T, J, LS);
		FinalPersonalityType ENTPH = new FinalPersonalityType("ENTJH", E, N, T, P, HS);
		FinalPersonalityType ENTPL = new FinalPersonalityType("ENTJL", E, N, T, P, LS);
		FinalPersonalityType ENFJH = new FinalPersonalityType("ENFJH", E, N, F, J, HS);
		FinalPersonalityType ENFJL = new FinalPersonalityType("ENFJL", E, N, F, J, LS);
		FinalPersonalityType ENFPH = new FinalPersonalityType("ENFPH", E, N, F, P, HS);
		FinalPersonalityType ENFPL = new FinalPersonalityType("ENFPL", E, N, F, P, LS);
		FinalPersonalityType ESTJH = new FinalPersonalityType("ESTJH", E, S, T, J, HS);
		FinalPersonalityType ESTJL = new FinalPersonalityType("ESTJL", E, S, T, J, LS);
		FinalPersonalityType ESTPH = new FinalPersonalityType("ESTPH", E, S, T, P, HS);
		FinalPersonalityType ESTPL = new FinalPersonalityType("ESTPL", E, S, T, P, LS);
		FinalPersonalityType ESFJH = new FinalPersonalityType("ESFJH", E, S, F, J, HS);
		FinalPersonalityType ESFJL = new FinalPersonalityType("ESFJL", E, S, F, J, LS);
		FinalPersonalityType ESFPH = new FinalPersonalityType("ESFPH", E, S, F, P, HS);
		FinalPersonalityType ESFPL = new FinalPersonalityType("ESFPL", E, S, F, P, LS);

// Reading in questions from a .csv file

		File csvfile = new File("Book1.csv");
		BufferedReader br = new BufferedReader(new FileReader(csvfile));
		String line = "";
		ArrayList<String> questions = new ArrayList<String>(0);
		ArrayList<Integer> weight = new ArrayList<Integer>(0);
		ArrayList<String> t1 = new ArrayList<String>(0);
		ArrayList<String> t2 = new ArrayList<String>(0);
		

		try {

			while ((line = br.readLine()) != null) {
				String[] count = line.split(",");
				questions.add(count[0]);
				weight.add(Integer.parseInt(count[3]));
				t1.add(count[1]);
				t2.add(count[2]);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}

// Instantiating ArrayLists for the Traits corresponding to each question

		ArrayList<Trait> tobj1 = new ArrayList<Trait>(0);
		ArrayList<Trait> tobj2 = new ArrayList<Trait>(0);

// Switch statement for adding Traits

		for (String x : t1) {

			switch (x) {
			case "I":
				tobj1.add(I);
				break;
			case "E":
				tobj1.add(E);
				break;
			case "N":
				tobj1.add(N);
				break;
			case "S":
				tobj1.add(S);
				break;
			case "J":
				tobj1.add(J);
				break;
			case "P":
				tobj1.add(P);
				break;
			case "LS":
				tobj1.add(LS);
			case "HS":
				tobj1.add(HS);
				break;
			}
		}

		for (String x : t2) {

			switch (x) {
			case "I":
				tobj2.add(I);
				break;
			case "E":
				tobj2.add(E);
				break;
			case "N":
				tobj2.add(N);
				break;
			case "S":
				tobj2.add(S);
				break;
			case "J":
				tobj2.add(J);
				break;
			case "P":
				tobj2.add(P);
				break;
			case "LS":
				tobj2.add(LS);
			case "HS":
				tobj2.add(HS);
				break;
			}
		}

// For loop that makes Question objects from ArrayLists

		int numOfQs = questions.size() - 2;
		System.out.println(tobj2.get(2));
		Question[] allQs = new Question[numOfQs];
		for (int i = 0; i < numOfQs; i++) {
			allQs[i] = new Question(questions.get(i), weight.get(i), tobj1.get(i), tobj2.get(i));
		}

// Initializing Response array, same number of objects as the number of questions

		Response[] allRs = new Response[numOfQs];

// Instantiating all Careers with their respective personality types	

		int numOfCs = 20;
		Career[] allCs = new Career[numOfCs];
		allCs[0] = new Career("Engineer", INTJH, INTJL);
		allCs[1] = new Career("Dentist", ISTJL, INTJL);
		allCs[2] = new Career("Counsler", INFJL, INFJH);
		allCs[3] = new Career("HR Director", ENFJL, ENFPL);
		allCs[4] = new Career("Construction Worker", ISTPL, ISTPH);
		allCs[5] = new Career("Psychologist", ESFJL, ESFJH);
		allCs[6] = new Career("Artist", INFPH, ISFPH);
		allCs[7] = new Career("Event Planner", ESFPL, ESFPH);
		allCs[8] = new Career("Reporter", ENFPL, ESFPL);
		allCs[9] = new Career("Firefighter", ESTPL, ESTJL);
		allCs[10] = new Career("Accountant", ISTJH, ISTJL);
		allCs[11] = new Career("Photographer", ISFJH, ISFJL);
		allCs[12] = new Career("Financial Planner", ENTPL, INTPL);
		allCs[13] = new Career("Veterinarian", ISFPL, ESFPL);
		allCs[14] = new Career("Marketer", ESTPL, ESTPH);
		allCs[15] = new Career("Teacher", ENFPL, ENFPH);
		allCs[16] = new Career("Police Officer", ESTJL, ISTJL);
		allCs[17] = new Career("Social Worker", ISFPL, ESFPL);
		allCs[18] = new Career("Lawyer", INTPL, INTJL);
		allCs[19] = new Career("Writer", INTPL, INTPH);

// PersonalityType object calculate is used to keep a running score of each Trait

		PersonalityType calculate = new PersonalityType();

		Scanner scan = new Scanner(System.in);

// Loop that asks the user questions and saves their responses	

		for (int i = 0; i < numOfQs;) {

			System.out.println(allQs[i].getText());
			System.out.println("Disagree completely: 1 2 Neutral: 3 4 Agree Comletely: 5");
			int res = scan.nextInt();
			if (res > 5 || res < 1) {
				System.out.println("Please input a number from 1-5");
			} else {
				allRs[i] = new Response(allQs[i], res);
				Trait temp = allRs[i].getDelta();
				int id = temp.getId();
				int w1 = allQs[i].getQWeight();
				calculate.addResponse(id, w1);
				i++;
			}
		}

// Creating a String out of the determined traits to link the responses to a FinalPersonalityType	

		String calculate1 = "";

		Trait s1;
		if (calculate.getScore(1) > calculate.getScore(2)) {
			s1 = I;
			calculate1 += "I";
		} else {
			s1 = E;
			calculate1 += "E";
		}

		Trait s2;
		if (calculate.getScore(3) > calculate.getScore(4)) {
			s2 = N;
			calculate1 += "N";
		} else {
			s2 = S;
			calculate1 += "S";
		}

		Trait s3;
		if (calculate.getScore(5) > calculate.getScore(6)) {
			s3 = T;
			calculate1 += "T";
		} else {
			s3 = F;
			calculate1 += "F";
		}

		Trait s4;
		if (calculate.getScore(7) > calculate.getScore(8)) {
			s4 = J;
			calculate1 += "J";
		} else {
			s4 = P;
			calculate1 += "P";
		}

		Trait s5;
		if (calculate.getScore(9) > calculate.getScore(10)) {
			s5 = HS;
			calculate1 += "H";
		} else {
			s5 = LS;
			calculate1 += "L";
		}

// Switch statement that takes the previous String and links it to a FinalPersonalityType	

		FinalPersonalityType calculateFinal;

		switch (calculate1) {
		case "INTJH":
			calculateFinal = INTJH;
			break;
		case "INTJL":
			calculateFinal = INTJL;
			break;
		case "INTPH":
			calculateFinal = INTPH;
			break;
		case "INTPL":
			calculateFinal = INTPL;
			break;
		case "INFJH":
			calculateFinal = INFJH;
			break;
		case "INFJL":
			calculateFinal = INFJL;
			break;
		case "INFPH":
			calculateFinal = INFPH;
			break;
		case "INFPL":
			calculateFinal = INFPL;
			break;
		case "ISTJH":
			calculateFinal = ISTJH;
			break;
		case "ISTJL":
			calculateFinal = ISTJL;
			break;
		case "ISTPH":
			calculateFinal = ISTPH;
			break;
		case "ISTPL":
			calculateFinal = ISTPL;
			break;
		case "ISFJH":
			calculateFinal = ISFJH;
			break;
		case "ISFJL":
			calculateFinal = ISFJL;
			break;
		case "ISFPH":
			calculateFinal = ISFPH;
			break;
		case "ISFPL":
			calculateFinal = ISFPL;
			break;
		case "ENTJH":
			calculateFinal = ENTJH;
			break;
		case "ENTJL":
			calculateFinal = ENTJL;
			break;
		case "ENTPH":
			calculateFinal = ENTPH;
			break;
		case "ENTPL":
			calculateFinal = ENTPL;
			break;
		case "ENFJH":
			calculateFinal = ENFJH;
			break;
		case "ENFJL":
			calculateFinal = ENFJL;
			break;
		case "ENFPH":
			calculateFinal = ENFPH;
			break;
		case "ENFPL":
			calculateFinal = ENFPL;
			break;
		case "ESTJH":
			calculateFinal = ESTJH;
			break;
		case "ESTJL":
			calculateFinal = ESTJL;
			break;
		case "ESTPH":
			calculateFinal = ESTPH;
			break;
		case "ESTPL":
			calculateFinal = ESTPL;
			break;
		case "ESFJH":
			calculateFinal = ESFJH;
			break;
		case "ESFJL":
			calculateFinal = ESFJL;
			break;
		case "ESFPH":
			calculateFinal = ESFPH;
			break;
		case "ESFPL":
			calculateFinal = ESFPL;
			break;
		default:
			calculateFinal = null;

		}

// Loop that outputs career recommendations based on personality type	

		System.out.println("Career Recommendations:");
		for (int i = 0; i < numOfCs; i++) {
			if (allCs[i].checkMatch(calculateFinal))
				System.out.println(allCs[i].getJobTitle());
		}
		
// Closes buffer reader		
		
		br.close();	
	}
	

}