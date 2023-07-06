package com_08.oop.interfacepkg.zoo;

public class Lion extends Animal  implements FoodInterface{
	
	@Override
	public String animalFood() {
		return "gazel";
	}
	
	@Override
	public String makeSound() {
		return "";
	}

}
