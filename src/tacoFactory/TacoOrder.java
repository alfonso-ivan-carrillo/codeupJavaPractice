package tacoFactory;

import java.util.ArrayList;

public class TacoOrder {
    public String customerName;
    public boolean toGo;
    public int orderTotal;
    public ArrayList<Taco> order;

    public TacoOrder(){
    }

    public TacoOrder(String customerName){
        this.customerName = customerName;
    }

    public TacoOrder(String customerName, boolean toGo){
        this.customerName = customerName;
        this.toGo = toGo;
    }

    public TacoOrder(String customerName, boolean toGo, int orderTotal){
        this.customerName = customerName;
        this.toGo = toGo;
        this.orderTotal = orderTotal;
    }
    public TacoOrder(String customerName, boolean toGo, int orderTotal, ArrayList<Taco> order){
        this.customerName = customerName;
        this.toGo = toGo;
        this.orderTotal = orderTotal;
        this.order = order;
    }

    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public boolean getToGo(){
        return toGo;
    }
    public void setToGo(boolean toGo){
        this.toGo = toGo;
    }

    public int getOrderTotal(){
        return orderTotal;
    }
    public void setOrderTotal(int orderTotal){
        this.orderTotal = orderTotal;
    }

    public ArrayList<Taco> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<Taco> order) {
        this.order = order;
    }
}
