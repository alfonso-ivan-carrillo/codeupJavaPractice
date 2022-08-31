package movies;

import util.Input;



public class MoviesApplication {

    private static String menu = "What would you like to do? \n" +
            "0 - exit \n" +
            "1 - view all movies \n" +
            "2 - view movies in the animated category \n" +
            "3 - view movies in the drama category \n" +
            "4 - view movies in the horror category \n" +
            "5 - view movies in the scifi category \n\n" +
            "Enter your choice: ";

    public static void filterMovies(){
        Movie[] allMovies = MoviesArray.findAll();

        for (Movie movie : allMovies){
            System.out.println("Title: " + movie.getName() + " \n -- Category: " + movie.getCategory());
        }
    }

    public static void filterCategory(String category){
        Movie[] allMovies = MoviesArray.findAll();

        for(Movie movie : allMovies){
            if(movie.getCategory().equalsIgnoreCase(category)){
                System.out.println(movie.getName() + " : " + movie.getCategory());
            }
        }
    }

    public static void selector(){
        Input userInput = new Input();

        int choice = userInput.getInt(menu);
        System.out.println(choice);



    }


    public static void main(String[] args) {

//        selector();

        filterMovies();
        filterCategory("horror");

    }
}
