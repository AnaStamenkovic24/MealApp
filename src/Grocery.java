import java.util.Objects;
import java.util.UUID;

public abstract class Grocery implements Energy {
    String company;
    String name;

    public Grocery(String company, String name) {
        this.company = company;
        this.name = name;

    }

    public Grocery(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }


    public void setCompany(String company) {
        this.company = company;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Two objects of the class Grocery are the same if their company and name are the same
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grocery grocery = (Grocery) o;
        return Objects.equals(company, grocery.company) && Objects.equals(name, grocery.name);
    }

    @Override
    public String toString() {
        return "Grocery{" +
                "company='" + company + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
