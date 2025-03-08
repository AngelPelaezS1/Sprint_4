package cat.itacademy.s04.t02.n02.service;

import java.util.List;
import java.util.Optional;

import cat.itacademy.s04.t02.n02.exception.FruitNotFoundException;
import cat.itacademy.s04.t02.n02.exception.InvalidFruitException;
import cat.itacademy.s04.t02.n02.model.Fruit;
import org.springframework.stereotype.Service;
import cat.itacademy.s04.t02.n02.repository.FruitRepository;

@Service
public class FruitService {
    private final FruitRepository fruitRepository;

    public FruitService(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    public String add(Fruit fruit) {
        if (fruit.getName().isEmpty()) {
            throw new InvalidFruitException("Error, nombre vacio.");
        } else {
            fruitRepository.save(fruit);
            return "Fruta guardada con exito.";
        }
    }

    public List<Fruit> getAll() {
        List<Fruit> fruits = fruitRepository.findAll();
        if (fruits.isEmpty()) {
            throw new InvalidFruitException("Error, la lista vacia.");
        }
        return fruits;
    }

    public Fruit getOne(Long id) {
        Optional<Fruit> optionalFruit = fruitRepository.findById(id);
        if (optionalFruit.isPresent()) {
            return optionalFruit.get();
        } else {
            throw new FruitNotFoundException("ID invalido, fruta no encntrada");
        }
    }

    public String delete(Long id) {
        Optional<Fruit> optionalFruit = fruitRepository.findById(id);
        if (optionalFruit.isPresent()) {
            fruitRepository.deleteById(id);
            return "Fruta eliminada con exito";
        } else {
            throw new FruitNotFoundException("ID invalido, fruta no encntrada");
        }
    }

    public String update(Fruit fruit, Long id) {
        Optional<Fruit> optionalFruit = fruitRepository.findById(id);;
        if (optionalFruit.isPresent()) {
            Fruit fruitUpdate = optionalFruit.get();
            fruitUpdate.setName(fruit.getName());
            fruitUpdate.setQuantityKilos(fruit.getQuantityKilos());
            fruitRepository.save(fruitUpdate);
            return "Fruta actualizada con exito";
        }else{
            throw new FruitNotFoundException("ID invalido, fruta no encntrada");
        }
    }
}
