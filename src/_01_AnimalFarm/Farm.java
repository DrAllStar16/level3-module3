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
		
		
			cow.makeNoise(1, 2);
			pig.makeNoise(1, 2);
			chicken.makeNoise(1, 2);
			sheep.makeNoise(1, 2);
			
		
	
	}

	@Override
	public String makeNoise(String moo, String bak, String oink, String bah) {
		// TODO Auto-generated method stub
		return "noise";
	}
	
}
