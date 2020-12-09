package _01_AnimalFarm;

public abstract class Animal {

	public abstract String makeNoise(String moo, String bak, String oink, String bah);

	public String common() {
		System.out.println(makeNoise(moo, bak, oink, bah));
		return "s";
		
	}
	
	
	
}
