import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fridge {
    private List<Nutriment> nutriments;

    public Fridge() {
        nutriments = new ArrayList<>();
    }

    public Fridge(List<Nutriment> nutriments) {
        this.nutriments = nutriments;
    }

    public List<Nutriment> getNutriments() {
        return nutriments;
    }

    public void add(Nutriment n, double weight) {
        if (!nutriments.contains(n)) {
            n.setWeight(weight);
            nutriments.add(n);
        } else
            for (Nutriment el : nutriments) {
                if (el.equals(n))
                    el.setWeight(el.getWeight() + weight);
                return;
            }
    }

    public void remove(Nutriment n) {
        nutriments.remove(n);
    }

    public void remove(Nutriment n, double weight) {
        for (Nutriment el : nutriments) {
            if (el.equals(n)) {
                if (el.getWeight() - weight > 0)
                    el.setWeight(el.getWeight() - weight);
            } else nutriments.remove(el);
        }
    }

    public String showAll() {
        StringBuilder sb = new StringBuilder();
        for (Nutriment el : nutriments)
            sb.append(el.getName()).append(" - ").append(el.getWeight()).append(" | ");
        if (sb.length() > 0)
            return sb.substring(0, sb.length() - 2);
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "nutriments=" + nutriments +
                '}';
    }
}
