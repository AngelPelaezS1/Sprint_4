package cat.itacademy.s04.t02.n01.services;

import org.springframework.stereotype.Service;
import cat.itacademy.s04.t02.n01.repository.FruitRepository;
import cat.itacademy.s04.t02.n01.model.Fruit;
import cat.itacademy.s04.t02.n01.exception.FruitNotFoundException;
import cat.itacademy.s04.t02.n01.exception.InvalidFruitException;
import java.util.List;
import java.util.Optional;

@Service
public class FruitService {
    private final FruitRepository fruitRepository;

    public FruitService(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    public String add(Fruit fruit) {
        if (fruit.getName().isEmpty()) {
            throw new InvalidFruitException("Nombre vacio.");
        } else {
            fruitRepository.save(fruit);
            return "Fruta agregada con exito.";
        }
    }

    public List<Fruit> getAll() {
        List<Fruit> fruits = fruitRepository.findAll();
        if (fruits.isEmpty()) {
            throw new FruitNotFoundException("No hay frutas en la lista.");
        }
        return fruits;
    }

    public Fruit getOne(long id){
        Optional<Fruit> optionalFruit = fruitRepository.findById(id);
        if(optionalFruit.isPresent()){
            return optionalFruit.get();
        } else {
            throw new FruitNotFoundException("Fruta no encontrada.");
        }
    }

    public String update(Fruit fruit, long id) {
        Optional<Fruit> optionalFruit = fruitRepository.findById(id);
        if (optionalFruit.isPresent()) {
            Fruit fruitUpdate = optionalFruit.get();
            fruitUpdate.setName(fruit.getName());
            fruitUpdate.setQuantityKilos(fruit.getQuantityKilos());
            fruitRepository.save(fruitUpdate);
            return "Fruta actualizada con exito.";
        } else {
            throw new FruitNotFoundException("Fruta no encontrada.");
        }
    }

    public String delete(long id){
        Optional<Fruit> optionalFruit = fruitRepository.findById(id);
        if(optionalFruit.isPresent()){
            fruitRepository.deleteById(id);
            return "Fruta eliminada con exito.";
        } else {
            throw new FruitNotFoundException("Fruta no encontrada.");
        }
    }
}
