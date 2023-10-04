package com.techelevator;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Module1CodingAssessment {

	public static void main(String[] args) {
		List<MovieRental> movieList = new ArrayList<>();

		MovieRental movie1 = new MovieRental("The Dictator", "DVD", true);
		MovieRental movie2 = new MovieRental("Titanic", "VHS", true);
		MovieRental movie3 = new MovieRental("Me and you", "Blue-RAY", false);

		movieList.add(movie1);
		movieList.add(movie2);
		movieList.add(movie3);

		printMovieList(movieList);

		// Write movie data to a file
		writeMovieDataToFile(movieList);
	}

	private static void printMovieList(List<MovieRental> movieList) {
		for (MovieRental movie : movieList) {
			System.out.println(movie.toString());
		}
	}

	private static void writeMovieDataToFile(List<MovieRental> movieList) {
		try (PrintWriter writer = new PrintWriter("movie_data.txt")) {
			for (MovieRental movie : movieList) {
				writer.println(movie.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}