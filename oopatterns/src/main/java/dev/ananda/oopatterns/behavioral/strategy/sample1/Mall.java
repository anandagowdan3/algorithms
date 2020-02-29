package dev.ananda.oopatterns.behavioral.strategy.sample1;

public class Mall implements Strategy {

	@Override
	public String build(String location) {
		return "Building a mall in the " + location + " area.";
	}

}
