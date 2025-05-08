package defult;

public class Smoothie extends Beverage {
    private int numOfFruits;
    private boolean addProtein;
    private final double PROTEIN_PRICE = 1.5;
    private final double FRUIT_PRICE = 0.5;
    
    public Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein) {
        super(bevName, Type.SMOOTHIE, size);
        this.numOfFruits = numOfFruits;
        this.addProtein = addProtein;
    }
    
    public double calcPrice() {
        double price = BASE_PRICE + addSizePrice() + (numOfFruits * FRUIT_PRICE);
        if (addProtein) price += PROTEIN_PRICE;
        return price;
    }
    
    public String toString() {
        return super.toString() + " Protein added: " + addProtein + " Fruits: " + numOfFruits + " Price: " + calcPrice();
    }
    
    public boolean equals(Object anotherBev) {
        if (!super.equals(anotherBev)) return false;
        Smoothie other = (Smoothie) anotherBev;
        return numOfFruits == other.numOfFruits && addProtein == other.addProtein;
    }
}