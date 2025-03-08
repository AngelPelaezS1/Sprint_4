package cat.itacademy.s04.t02.n03.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fruits")
public class Fruit {

    @Id
    private String id;
    private String name;
    private int quantityKilos;

    public Fruit() {
    }

    public Fruit(String name, int quantityKilos) {
        this.name = name;
        this.quantityKilos = quantityKilos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityKilos() {
        return quantityKilos;
    }

    public void setQuantityKilos(int quantityKilos) {
        this.quantityKilos = quantityKilos;
    }
}
