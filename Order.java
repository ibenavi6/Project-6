package defult;

import java.util.ArrayList;
import java.util.Random;

public class Order implements OrderInterface, Comparable<Order> {
    private int orderTime;
    private Day orderDay;
    private Customer customer;
    private int orderNo;
    private ArrayList<Beverage> beverages;

    public Order(int orderTime, Day orderDay, Customer customer) {
        this.orderTime = orderTime;
        this.orderDay = orderDay;
        this.customer = new Customer(customer);
        this.orderNo = generateOrder();
        this.beverages = new ArrayList<>();
    }

    private int generateOrder() {
        Random rand = new Random();
        return rand.nextInt(80001) + 10000;
    }

    public boolean isWeekend() {
        return orderDay == Day.SATURDAY || orderDay == Day.SUNDAY;
    }

    public Beverage getBeverage(int itemNo) {
        if (itemNo >= 0 && itemNo < beverages.size()) {
            return beverages.get(itemNo);
        }
        return null;
    }

    public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
        beverages.add(new Coffee(bevName, size, extraShot, extraSyrup));
    }

    public void addNewBeverage(String bevName, Size size) {
        beverages.add(new Alcohol(bevName, size, isWeekend()));
    }

    public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
        beverages.add(new Smoothie(bevName, size, numOfFruits, addProtein));
    }

    public double calcOrderTotal() {
        double total = 0;
        for (Beverage b : beverages) {
            total += b.calcPrice();
        }
        return total;
    }

    public int findNumOfBeveType(Type type) {
        int count = 0;
        for (Beverage b : beverages) {
            if (b.getType() == type) {
                count++;
            }
        }
        return count;
    }

    public int compareTo(Order anotherOrder) {
        if (this.orderNo == anotherOrder.orderNo) return 0;
        return this.orderNo > anotherOrder.orderNo ? 1 : -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order Number: ").append(orderNo).append(", Time: ").append(orderTime)
          .append(", Day: ").append(orderDay).append(", Customer: ").append(customer).append("\nBeverages:\n");
        for (Beverage b : beverages) {
            sb.append(b).append("\n");
        }
        return sb.toString();
    }

    public Customer getCustomer() {
        return new Customer(customer);
    }

    public int getOrderNo() {
        return orderNo;
    }

    public int getOrderTime() {
        return orderTime;
    }

    public Day getOrderDay() {
        return orderDay;
    }

    public int getTotalItems() {
        return beverages.size();
    }
}