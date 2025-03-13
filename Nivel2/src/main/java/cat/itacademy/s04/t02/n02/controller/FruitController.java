package cat.itacademy.s04.t02.n02.controller;

import java.util.List;
import cat.itacademy.s04.t02.n02.model.Fruit;
import cat.itacademy.s04.t02.n02.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fruit")
public class FruitController {

    private final FruitService fruitService;

    @Autowired
    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @PostMapping("/add")
    public String addFruit(@RequestBody Fruit fruit) {
        return fruitService.add(fruit);
    }

    @GetMapping("/getAll")
    public List<Fruit> getAllFruits(){
        return fruitService.getAll();
    }

    @GetMapping("/getOne/{id}")
    public Fruit getAllFruits(@PathVariable Long id){
        return fruitService.getOne(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteFruit(@PathVariable Long id){
        return fruitService.delete(id);
    }

    @PutMapping("/update/{id}")
    public String updateFruit(@RequestBody Fruit fruit, @PathVariable Long id){
        return fruitService.update(fruit, id);
    }
}

