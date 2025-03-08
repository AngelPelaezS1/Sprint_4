package cat.itacademy.s04.t02.n03.controller;

import cat.itacademy.s04.t02.n03.service.FruitService;
import org.springframework.stereotype.Controller;
import cat.itacademy.s04.t02.n03.model.Fruit;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruit")
public class FruitController {
    private final FruitService fruitService;

    public FruitController(FruitService fruitService){
        this.fruitService = fruitService;
    }
    @PostMapping("/add")
    public String addFruit(@RequestBody Fruit fruit){
        return fruitService.add(fruit);
    }
    @GetMapping("/getAll")
    public List<Fruit> getAllFruits(){
        return fruitService.getAll();
    }
    @GetMapping("/getOne/{id}")
    public Fruit getOneFruit(@PathVariable String id){
        return fruitService.getOne(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteFruit(@PathVariable String id){
        return fruitService.delete(id);
    }
    @PutMapping("/update/{id}")
    public String updateFruit(@PathVariable String id, @RequestBody Fruit fruit){
        return fruitService.update(fruit, id);
    }
}
