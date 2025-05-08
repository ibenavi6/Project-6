package defult;

public class Alcohol extends Beverage {
    private boolean isWeekend;
    private final double WEEKEND_PRICE = 0.6;
    
    public Alcohol(String bevName, Size size, boolean isWeekend) {
        super(bevName, Type.ALCOHOL, size);
        this.isWeekend = isWeekend;
    }
    
    public double calcPrice() {
        double price = BASE_PRICE + addSizePrice();
        if (isWeekend) price += WEEKEND_PRICE;
        return price;
    }
    
    public String toString() {
        return super.toString() + " Weekend: " + isWeekend + " Price: " + calcPrice();
    }
    
    public boolean equals(Object anotherBev) {
        if (!super.equals(anotherBev)) return false;
        Alcohol other = (Alcohol) anotherBev;
        return isWeekend == other.isWeekend;
    }
}