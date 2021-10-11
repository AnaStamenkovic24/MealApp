import java.util.UUID;

public class Drink extends Nutriment {

    public Drink(String name, double kcal, double proteins,
                 double carbohydrates, double fats, double fiber) {
        super(name, kcal, proteins, carbohydrates, fats, fiber);
    }

    public Drink(String company, String name, UUID id, double weight,
                 double kcal, double proteins, double carbohydrates, double fats, double fiber) {
        super(company, name, id, weight, kcal, proteins, carbohydrates, fats, fiber);
    }

    public Drink(Drink d) {
        this(d.getName(), d.getKcal(), d.getProteins(),
                d.getCarbohydrates(),
                d.getFats(), d.getFiber());
    }
}
