package cat.itacademy.s04.t02.n01.controllers;

import cat.itacademy.s04.t02.n01.services.FruitService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import cat.itacademy.s04.t02.n01.model.Fruit;
import java.util.List;

@RestController
@RequestMapping("/fruit")
public class FruitController {

    private final FruitService fruitService;

    @Autowired
    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @PostMapping("/add")
    public void addFruit(@RequestBody Fruit fruit){
        fruitService.add(fruit);
    }

    @GetMapping("/getAll")
    public List<Fruit> getAllFruits(){
        return fruitService.getAll();
    }

    @GetMapping("/getOne/{id}")
    public Fruit getOneFruit(@PathVariable long id){
        return fruitService.getOne(id);
    }

    @PutMapping("/update/{id}")
    public String updateFruit(@RequestBody Fruit fruit, @PathVariable long id){
        return fruitService.update(fruit, id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteFruit(@PathVariable long id){
        return fruitService.delete(id);
    }
}