package movies;

import util.Input;

import java.util.Arrays;


public class MoviesApplication {

    private static Movie[] allMovies = MoviesArray.findAll();
    private static String menu = "What would you like to do? \n" +
            "0 - exit \n" +
            "1 - view all movies \n" +
            "2 - view movies in the animated category \n" +
            "3 - view movies in the drama category \n" +
            "4 - view movies in the horror category \n" +
            "5 - view movies in the scifi category \n" +
            "6 - add movie to list \n\n" +
            "Enter your choice: ";

    public static void allMovies(){
        for (Movie movie : allMovies){
            System.out.println("Title: " + movie.getName() + " \n -- Category: " + movie.getCategory());
        }
    }

    public static void filterCategory(String category){
//        Movie[] allMovies = MoviesArray.findAll();

        for(Movie movie : allMovies){
            if(movie.getCategory().equalsIgnoreCase(category)){
                System.out.println(movie.getName() + " : " + movie.getCategory());
            }
        }
    }
    public static void movieCase(int num){

            switch (num){
                case 0:
                    System.out.println("\nExiting\n");
                    break;
                case 1:
                    allMovies();
                    System.out.println("\nReturning to Menu.\n");
                    break;
                case 2:
                    filterCategory("animated");
                    System.out.println("\nReturning to Menu.\n");
                    break;
                case 3:
                    filterCategory("drama");
                    System.out.println("\nReturning to Menu.\n");
                    break;
                case 4:
                    filterCategory("horror");
                    System.out.println("\nReturning to Menu.\n");
                    break;
                case 5:
                    filterCategory("scifi");
                    System.out.println("\nReturning to Menu.\n");
                    break;
                case 6:
                    createMovie();
                    break;

            }
    }


    public static Movie createMovie(){
        Input userMovie = new Input();
        String title = userMovie.getString("Enter title: ");
        String cat = userMovie.getString("Enter category: ");
        Movie newMovie = new Movie(title, cat);
        System.out.println(newMovie.getName() + " : " + newMovie.getCategory());
        addMovie(allMovies, newMovie);
        return newMovie;
    }

    public static Movie[] addMovie(Movie movies[], Movie movie){

        movies = Arrays.copyOf(movies, movies.length + 1);
        movies[movies.length -1 ] = movie;
            for(Movie n: movies){
                System.out.println(n.getName() + " : " + n.getCategory());
            }
        allMovies = movies;
        return allMovies;
    }

    public static void selector(){
        Input userInput = new Input();

        do {
            int choice = userInput.getInt(menu);
            System.out.println(choice);
            movieCase(choice);
            userInput.yesNo("Make another selection? (yes/no)");
        } while(userInput.yesNo());
        System.out.println("bye");

    }


    public static void main(String[] args) {

        selector();
//        Movie seven = new Movie("Seven", "drama");
//        addMovie(MoviesArray.findAll(), seven);
//            createMovie();


    }
}
