package flw;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {

    private final ArrayList<Flower> bouquet;

    public Bouquet() {
        this.bouquet = new ArrayList<>();
    }

    public Bouquet(Flower... flowers) {
        this.bouquet = new ArrayList<>(List.of(flowers));
    }

    public void add(Flower flower) {
        bouquet.add(flower);
    }

    public double getCost() {
        double sum = 0.0;
        for (Flower flower : bouquet) {
            sum += flower.getCost();
        }
        return sum * 1.1;
    }

    public int getLifeSpan() {
        int min = Integer.MAX_VALUE;
        for (Flower flower : bouquet) {
            if (min > flower.getLifeSpan()) {
                min = flower.getLifeSpan();
            }
        }
        return min;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Букет, в котором есть ");
        for (Flower flower : bouquet) {
            sb.append(flower.getName().toLowerCase()).append(" - ").append(flower.getLifeSpan()).append(", ");
        }
        sb.append("будет стоить ").append(String.format("%.2f", getCost())).append(" рублей и простоит ");
        sb.append(getLifeSpan()).append(" сут.");
        return sb.toString();
    }

}
