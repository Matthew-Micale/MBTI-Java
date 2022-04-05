// Keeps a running tally of the scores linked to each Trait
// The Trait with the highest score of each sphere is sent to FinalPersonalityType

public class PersonalityType {
	double iScore = 0;
	double eScore = 0;

	double nScore = 0;
	double sScore = 0;

	double tScore = 0;
	double fScore = 0;

	double jScore = 0;
	double pScore = 0;

	double hsScore = 0;
	double lsScore = 0;

	Trait sphere1;
	Trait sphere2;
	Trait sphere3;
	Trait sphere4;
	Trait sphere5;

// Adds points to the correct Trait based on the Responses

	public void addResponse(int id, int weight) {

		switch (id) {
		case 1:
			iScore += weight;
			break;
		case 2:
			eScore += weight;
			break;
		case 3:
			nScore += weight;
			break;
		case 4:
			sScore += weight;
			break;
		case 5:
			tScore += weight;
			break;
		case 6:
			fScore += weight;
			break;
		case 7:
			jScore += weight;
			break;
		case 8:
			pScore += weight;
			break;
		case 9:
			hsScore += weight;
			break;
		case 10:
			lsScore += weight;
			break;
		}
	}

// Returns the score of each Trait based on its ID number

	public double getScore(int tID) {

		switch (tID) {
		case 1:
			return iScore;

		case 2:
			return eScore;

		case 3:
			return nScore;

		case 4:
			return sScore;

		case 5:
			return tScore;

		case 6:
			return fScore;

		case 7:
			return jScore;

		case 8:
			return pScore;

		case 9:
			return hsScore;

		case 10:
			return lsScore;

		default:
			return 0;
		}
	}

}
