package _02_Cities;

public class Boston extends City {
	double ex = 0;
	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		ex = population+(population/2);
		return (ex*growthRate);
	}

}
