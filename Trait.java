// Class that stores the ID number for all 10 Traits

public class Trait {
	public String traitName;
	public int traitId;

// Trait constructor	

	public Trait(String tn, int id) {

		traitName = tn;
		traitId = id;

	}

	public int getId() {
		return traitId;
	}
}
