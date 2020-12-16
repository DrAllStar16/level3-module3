package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm{

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
		
		 String noise = " ";
		 
	for (int i = 0; i < Farm.size(); i++) {
		if (Farm.get(i).equals(cow)) {
			noise = "moo";
		}
		if (Farm.get(i).equals(pig)) {
			noise = "oink";
		}
		if (Farm.get(i).equals(chicken)) {
			noise = "bak";
		}
		if (Farm.get(i).equals(sheep)) {
			noise = "bah";
		}
		Farm.get(i).makeNoise(noise);
		Farm.get(i).eat();
			
		
		}
			
	}
	
	
}
