package defult;
/*
 * Class: CMSC203 
 * Instructor: 
 * Description: Abstract class for Beverages
 * Due: MM/DD/YYYY
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source. I have not given my code to any student.
 * Print your Name here: __________
 */
public abstract class Beverage {
    private String bevName;
    private Type type;
    private Size size;
    public final double BASE_PRICE = 2.0;
    public final double SIZE_PRICE = 0.5;
    
    public Beverage(String bevName, Type type, Size size) {
        this.bevName = bevName;
        this.type = type;
        this.size = size;
    }
    
    public double addSizePrice() {
        if (size == Size.MEDIUM)
            return SIZE_PRICE;
        else if (size == Size.LARGE)
            return 2 * SIZE_PRICE;
        return 0;
    }
    
    public abstract double calcPrice();
    
    public String toString() {
        return bevName + ", " + size;
    }
    
    public boolean equals(Object anotherBev) {
        if (anotherBev instanceof Beverage) {
            Beverage other = (Beverage) anotherBev;
            return bevName.equals(other.bevName) && type == other.type && size == other.size;
        }
        return false;
    }
    
    public String getBevName() {
        return bevName;
    }
    
    public Type getType() {
        return type;
    }
    
    public Size getSize() {
        return size;
    }
}