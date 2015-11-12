package examples;

import java.util.ArrayList;
import java.util.List;

import lib.Apple;
import predicate.AppleGreenColorPredicate;
import predicate.AppleHavierThan150Predicate;
import predicate.ApplePredicate;

public class PassingCodeWithBehaviourParametrization {
	
	/**
	 * Znajduje zielone jabka o wadze >= 150
	 */
	public static void findGreenAndHavierOrEqualThan150(List<Apple> list){
		for(Apple apple: list){
			if(apple.getColor().equals("green") && apple.getWeight() >= 150){
				System.out.println(String.format("Color: %s, weight: %s",
						apple.getColor(),
						apple.getWeight()));
			}
		}
	}
	
	//Wytłumaczyć - rózne kombinacje parametrów, różne funkcje
	
	
	public static void main(String[] args){	
		
		List<Apple> inventory = new ArrayList<Apple>();
		
		inventory.add(new Apple("green", 150));
		inventory.add(new Apple("red", 135));
		inventory.add(new Apple("red", 125));
		inventory.add(new Apple("green", 142));
		inventory.add(new Apple("green", 133));
		inventory.add(new Apple("yellow", 160));
		inventory.add(new Apple("red", 122));
		inventory.add(new Apple("green", 153));
		
		
		findGreenAndHavierOrEqualThan150(inventory);
		
	}
}
