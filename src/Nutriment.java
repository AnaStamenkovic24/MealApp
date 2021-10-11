import java.util.UUID;

public abstract class Nutriment extends Grocery {

    private UUID id;
    private double weight;
    private double kcal;
    private double proteins;
    private double carbohydrates;
    private double fats;
    private double fiber;

    public Nutriment(String company, String name, UUID id,
                     double weight, double kcal, double proteins,
                     double carbohydrates, double fats, double fiber) {
        super(company, name);
        this.id = id;
        this.weight = weight;
        this.kcal = kcal;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.fiber = fiber;
    }

    public Nutriment(String name, double kcal, double proteins,
                     double carbohydrates, double fats, double fiber) {
        super(name);
        this.kcal = kcal;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.fiber = fiber;
    }

    public void update(Double weight, Double kcal, Double proteins,
                       Double carbohydrates, Double fats, Double fiber) {
        if(weight != null)
            this.weight = weight;
        if(kcal != null)
            this.kcal = kcal;
        if(proteins != null)
            this.proteins = proteins;
        if(carbohydrates != null)
            this.carbohydrates = carbohydrates;
        if(fats != null)
            this.fats = fats;
        if(fiber != null)
            this.fiber = fiber;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getKcal() {
        return kcal;
    }

    public double getProteins() {
        return proteins;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getFats() {
        return fats;
    }

    public double getFiber() {
        return fiber;
    }

    public void setKcal(double kcal) {
        this.kcal = kcal;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public void setFiber(double fiber) {
        this.fiber = fiber;
    }
    public double getTotalProteins() {
        return weight / 100 * proteins;
    }

    public double getTotalCarbohydrates() {
        return weight / 100 * carbohydrates;
    }

    public double getTotalFats() {
        return weight / 100 * fats;
    }

    public double getTotalFiber() {
        return weight / 100 * fiber;
    }

    public double getTotalKcal() {
        return weight / 100 * kcal;
    }

    public String totalNutrientTable() {
        return super.toString() + "\nWeight: " + weight + "g\nKcal: " + getKcal() + "\nProteins: " +
                getTotalProteins() + "g\nCarbohydrates: " + getTotalCarbohydrates() +
                "g\nFats: " + getTotalFats() + "g\nFiber: " + getTotalFiber();
    }

    @Override
    public String toString() {
        return "Nutriment{" +
                "id=" + id +
                ", weight=" + weight +
                ", kcal=" + kcal +
                ", proteins=" + proteins +
                ", carbohydrates=" + carbohydrates +
                ", fats=" + fats +
                ", fiber=" + fiber +
                '}';
    }

}
