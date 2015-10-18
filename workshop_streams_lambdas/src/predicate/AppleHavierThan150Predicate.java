package predicate;

import lib.Apple;

public class AppleHavierThan150Predicate implements ApplePredicate{

	@Override
	public boolean test(Apple apple) {
		return (apple.getWeight() >= 150);
	}

}
