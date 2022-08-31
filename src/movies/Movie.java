package movies;

public class Movie {
    // fields
    private String name;
    private String category;

    // constructors

    public Movie() {
    }

    public Movie(String name){
        this.name = name;
    }

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    // Getters
    public String getName() {
        return name;
    }
    public String getCategory(){
        return category;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setCategory(String category){
        this.category = category;
    }

}
