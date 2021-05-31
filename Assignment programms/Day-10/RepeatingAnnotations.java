package com.onebill.corejava.Day10Assignment;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class RepeatingAnnotations {
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Games {
		ClubGame[] value() default {};
	}

	@ClubGame("Rummy")
	@ClubGame("Bike-race")
	@ClubGame("Table-tennis")
	@ClubGame("Subway-Surf")
	public @interface Game {
		String value();
	}

	@Repeatable(value = Games.class)
	public @interface ClubGame {
		String value();
	}

	public static void main(String[] args) {
		ClubGame[] a = Game.class.getAnnotationsByType(ClubGame.class);
		System.out.println("No of games.. " + a.length);
		Games games = Game.class.getAnnotation(Games.class);
		for (ClubGame m : games.value()) {
			System.out.println(m.value());
		}

	}

}