package flw;

public class Flower {

    private String name;
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;

    private static final String DEFAULT_COLOR = "белый";
    private static final String DEFAULT_COUNTRY = "России";
    private static final double DEFAULT_COST = 1.0;
    private static final int DEFAULT_LIFE_SPAN = 3;

    public Flower(String name, String country, double cost, int lifeSpan, String flowerColor) {
        this.name = (name != null) ? name : "";
        setFlowerColor(flowerColor);
        setCountry(country);
        setCost(cost);
        setLifeSpan(lifeSpan);
    }

    public Flower(String name, String country, double cost, int lifeSpan) {
        this(name, country, cost, lifeSpan, DEFAULT_COLOR);
    }

    public Flower(String name, double cost, int lifeSpan) {
        this(name, DEFAULT_COUNTRY, cost, lifeSpan);
    }

    public Flower(String name, String country, double cost) {
        this(name, country, cost, DEFAULT_LIFE_SPAN, DEFAULT_COLOR);
    }

    private boolean isValid(String field) {
        return field != null && !field.isEmpty() && !field.isBlank();
    }

    private boolean isValid(double field) {
        return field > 0;
    }

    public String getName() {
        return name;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = isValid(flowerColor) ? flowerColor : DEFAULT_COLOR;
    }

    public void setCountry(String country) {
        this.country = isValid(country) ? country : DEFAULT_COUNTRY;
    }

    public void setCost(double cost) {
        this.cost = isValid(cost) ? cost : DEFAULT_COST;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = isValid(lifeSpan) ? lifeSpan : DEFAULT_LIFE_SPAN;
    }

    @Override
    public String toString() {
        return String.format("%s из %s, стоимость штуки – %.2f рублей, срок стояния – %d дн., цвет - %s",
                name, country, cost, lifeSpan, flowerColor);
    }
}
