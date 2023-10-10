import java.util.ArrayList;
import java.util.List;

public class MovieApp {

    public static void main(String[] args) {
        List <MovieApp> movieAppList = new ArrayList<MovieApp>();
        MovieRental movie1 = new MovieRental("The Dictator", "DVD", true);
        MovieRental movie2 = new MovieRental("Titanic", "VHS", true);
        MovieRental movie3 = new MovieRental("She and I", "Blu-Ray", false);



    }

    private static void printMovieList(List<MovieRental> movieList) {
        for (MovieRental movie: movieList);
    }

}
