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

    public static void allMovies(){
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
    public static void movieCase(int num){

            switch (num){
                case 0:
                    System.out.println("Exiting\n");
                    break;
                case 1:
                    allMovies();
                    System.out.println("Returning to Menu.\n");
                    break;
                case 2:
                    filterCategory("animated");
                    System.out.println("Returning to Menu.\n");
                    break;
                case 3:
                    filterCategory("drama");
                    System.out.println("Returning to Menu.\n");
                    break;
                case 4:
                    filterCategory("horror");
                    System.out.println("Returning to Menu.\n");
                    break;
                case 5:
                    filterCategory("scifi");
                    System.out.println("Returning to Menu.\n");
                    break;
            }

    }

    public static void selector(){
        Input userInput = new Input();

        do {
            int choice = userInput.getInt(menu);
            System.out.println(choice);
            movieCase(choice);
            userInput.yesNo("Make another selection?");
        } while(userInput.yesNo());
        System.out.println("bye");

    }


    public static void main(String[] args) {

        selector();

//        allMovies();
//        filterCategory("drama");

    }
}
