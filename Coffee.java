package defult;

public class Coffee extends Beverage {
    private boolean extraShot;
    private boolean extraSyrup;
    private final double EXTRA_SHOT_PRICE = 0.5;
    private final double EXTRA_SYRUP_PRICE = 0.5;
    
    public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
        super(bevName, Type.COFFEE, size);
        this.extraShot = extraShot;
        this.extraSyrup = extraSyrup;
    }
    
    public double calcPrice() {
        double price = BASE_PRICE + addSizePrice();
        if (extraShot) price += EXTRA_SHOT_PRICE;
        if (extraSyrup) price += EXTRA_SYRUP_PRICE;
        return price;
    }
    
    public String toString() {
        return super.toString() + " Extra shot: " + extraShot + " Extra syrup: " + extraSyrup + " Price: " + calcPrice();
    }
    
    public boolean equals(Object anotherBev) {
        if (!super.equals(anotherBev)) return false;
        Coffee other = (Coffee) anotherBev;
        return extraShot == other.extraShot && extraSyrup == other.extraSyrup;
    }
}