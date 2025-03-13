package cat.itacademy.s04.t02.n03.controller;

import cat.itacademy.s04.t02.n03.service.FruitService;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Fruit> addFruit(@RequestBody Fruit fruit){
        Fruit createdFruit = fruitService.add(fruit);
        return ResponseEntity.ok(createdFruit);

    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Fruit>> getAllFruits(){
        List<Fruit> fruits = fruitService.getAll();
        return ResponseEntity.ok(fruits);
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruit> getOneFruit(@PathVariable String id){
        Fruit fruit = fruitService.getOne(id);
        return ResponseEntity.ok(fruit);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFruit(@PathVariable String id){
        boolean fruitDelete = fruitService.delete(id);
        if (fruitDelete) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Fruit> updateFruit(@PathVariable String id, @RequestBody Fruit fruit){
        Fruit updateFruit = fruitService.update(fruit, id);
        return ResponseEntity.ok(updateFruit);
    }
}
