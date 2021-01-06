package _02_Cities;

public class LosAngeles extends City{
	double pgr = 0;
	double ngr = 0;
	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		pgr = (population*growthRate);
		ngr = (growthRate/2);
		return (pgr*ngr);
	}
	
}
