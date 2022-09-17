package groceryproject;

public class GroceryItem {

    public String name;
    public String category;
    public int amount;

    public GroceryItem() {
    }

    public GroceryItem(String name) {
        this.name = name;
    }

    public GroceryItem(String name, String category){
        this.name = name;
        this.category = category;
    }

    public GroceryItem(String name, String category, int amount){
        this.name = name;
        this.category = category;
        this.amount = amount;
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

    public int getAmount(){
        return amount;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
}
