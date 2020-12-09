package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm extends Animal{

	public static void main(String[] args) {
		Cow cow = new Cow();
		Pig pig = new Pig();
		Chicken chicken = new Chicken();
		Sheep sheep = new Sheep();
		ArrayList<Animal> Farm = new ArrayList<Animal>();
		
		Farm.add(cow);
		Farm.add(pig);
		Farm.add(chicken);
		Farm.add(sheep);
		
		
			cow.makeNoise("moo", "moo", "moo", "moo");
			pig.makeNoise("oink", "oink", "oink", "oink");
			chicken.makeNoise("bak", "bak", "bak", "bak");
			sheep.makeNoise("bah", "bah", "bah", "bah");
			
			cow.common();
			pig.common();
			chicken.common();
			sheep.common();
			
		
	
	}

	@Override
	public String makeNoise(String moo, String bak, String oink, String bah) {
		// TODO Auto-generated method stub
		return "noise";
	}
	
}
