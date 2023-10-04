package com.techelevator;
import java.util.*;

public class Module1CodingAssessment {

	public static void main(String[] args) {
		MovieRental movie1 = new MovieRental("The Dictator", "DVD", true);
		MovieRental movie2 = new MovieRental("Titanic", "VHS", true);
		MovieRental movie3 = new MovieRental("Me and you", "Blue-Ray", false);

		Module1CodingAssessment mca = new Module1CodingAssessment();
		mca.run();
	}

	private static void printMovieList(List<MovieRental> movieList) {
		for (MovieRental movie : movieList) {
			System.out.println(movie.toString());
		}
	}

	private void run() {


	}

}
