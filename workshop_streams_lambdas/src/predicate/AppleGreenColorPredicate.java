package predicate;

import lib.Apple;

public class AppleGreenColorPredicate implements ApplePredicate{

	@Override
	public boolean test(Apple apple) {
		return apple.getColor().equals("green");
	}

}
