package _02_Cities;

public class Atlanta extends City{
	double gr = 0;
	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		gr = (growthRate*2);
		return (population*gr);
	}

}
