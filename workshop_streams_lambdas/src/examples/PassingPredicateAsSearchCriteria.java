package examples;

import java.util.ArrayList;
import java.util.List;

import lib.Apple;
import predicate.AppleGreenColorPredicate;
import predicate.AppleHavierThan150Predicate;
import predicate.ApplePredicate;

public class PassingPredicateAsSearchCriteria {
	
	public static void findApplesWithPredicate(List<Apple>list, ApplePredicate criteria){
		for(Apple apple: list){
			if(criteria.test(apple)){
				System.out.println(String.format("Color: %s, weight: %s",
						apple.getColor(),
						apple.getWeight()));
			}
		}
	}

public static void main(String[] args){	
		
		List<Apple> inventory = new ArrayList<>();
		
		inventory.add(new Apple("green", 150));
		inventory.add(new Apple("red", 135));
		inventory.add(new Apple("red", 125));
		inventory.add(new Apple("green", 142));
		inventory.add(new Apple("green", 133));
		inventory.add(new Apple("yellow", 160));
		inventory.add(new Apple("red", 122));
		inventory.add(new Apple("green", 153));		
		
		AppleGreenColorPredicate searchGreen = new AppleGreenColorPredicate();
		AppleHavierThan150Predicate searchHeavy = new AppleHavierThan150Predicate();
		
		findApplesWithPredicate(inventory, searchGreen);
		
		System.out.println();
		
		findApplesWithPredicate(inventory, searchHeavy);
	}
}
