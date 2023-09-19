package com.techelevator;

public class StringExamples {


    public static void main(String[] args) {


        String movie = "Toy Story";
        System.out.println(movie);

        movie = movie.toUpperCase();
        System.out.println(movie);

        char c =  movie.charAt(4);
        System.out.println(c);

        String[] words = movie.split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        String brian = "Brian";
        String steve = "Steve";
        String movieTitle = "Top Gun";






        if (brian.equals(steve)) {
            System.out.println("They are equal");
        }




        String[] myFavoriteMovies = new String[5];
        myFavoriteMovies[2] = movieTitle;
        myFavoriteMovies[0] = "Step Brothers";
       // myFavoriteMovies[1] = "Alien";
        myFavoriteMovies[3] = "Jaws";
        myFavoriteMovies[4] = "Intersteller";

        for (int i = 0; i < myFavoriteMovies.length; i++) {

          //  String movieName = myFavoriteMovies[i];
            if (myFavoriteMovies[i] != null) {
                if (myFavoriteMovies[i].endsWith("s")) {
                    System.out.println(myFavoriteMovies[i] + " Ends with s");
                }
            }

            if (myFavoriteMovies[i] == null) {
                myFavoriteMovies[i] = "Office Space";
            }


        }


        String sentence = "The quick brown fox jumped over the lazy dogs back";

        if(sentence.contains("fox")) {
            int indexFound = sentence.indexOf("fox");
            System.out.println("fox was found at index: " + indexFound);
        }

        String remainingSentence = sentence.substring(sentence.indexOf("brown"));

        String firstPart = sentence.substring(0,9);
        System.out.println(firstPart);



    }


}
