package tacoFactory;

public class Taco {

    public String name;
    public String category;
    public int quantity;

    public Taco() {
    }

    public Taco(String name) {
        this.name = name;
    }

    public Taco(String name, String category){
        this.name = name;
        this.category = category;
    }

    public Taco(String name, String category, int quantity){
        this.name = name;
        this.category = category;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }

    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
