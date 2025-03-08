package cat.itacademy.s04.t02.n03.service;

import cat.itacademy.s04.t02.n03.exception.FruitDoesntExistException;
import cat.itacademy.s04.t02.n03.exception.FruitNotFoundException;
import cat.itacademy.s04.t02.n03.repository.FruitRepository;
import org.springframework.stereotype.Service;
import cat.itacademy.s04.t02.n03.model.Fruit;

import java.util.List;
import java.util.Optional;

@Service
public class FruitService {
    private final FruitRepository fruitRepository;

    public FruitService(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    public String add(Fruit fruit){
        if(fruit.getName().isEmpty()){
            throw new FruitNotFoundException("Error, nombre vacio.");
        }else{
            fruitRepository.save(fruit);
            return "Fruta guardada con exito";
        }
    }

    public List<Fruit> getAll(){
        List<Fruit> fruits = fruitRepository.findAll();
        if(fruits.isEmpty()){
            throw new FruitNotFoundException("La lista esta vacia");
        }else{
            return fruits;
        }
    }

    public Fruit getOne(String id){
        Optional<Fruit> optionalFruit = fruitRepository.findById(id);
        if(optionalFruit.isPresent()){
            return optionalFruit.get();
        }else{
            throw new FruitDoesntExistException("Error, no hay ninguna fruta con este id");
        }
    }

    public String delete(String id){
        Optional<Fruit> optionalFruit = fruitRepository.findById(id);
        if(optionalFruit.isPresent()){
            fruitRepository.deleteById(id);
            return "Fruta eliminada con exito";
        }else{
            throw new FruitDoesntExistException("Error, no hay ninguna fruta con este id");
        }
    }

    public String update(Fruit fruit, String id){
        Optional<Fruit> optionalFruit = fruitRepository.findById(id);
        if(optionalFruit.isPresent()){
            Fruit fruitUpdate = optionalFruit.get();
            fruitUpdate.setName(fruit.getName());
            fruitUpdate.setQuantityKilos(fruit.getQuantityKilos());
            fruitRepository.save(fruitUpdate);
            return "Fruta actualizada con exito";
        }else{
            throw new FruitDoesntExistException("Error, no hay ninguna fruta con este id");
        }
    }
}
