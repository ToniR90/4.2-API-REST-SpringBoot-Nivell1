package cat.itacademy.s04.t02.n01.service;

import cat.itacademy.s04.t02.n01.exception.ResourceNotFoundException;
import cat.itacademy.s04.t02.n01.model.Fruit;
import cat.itacademy.s04.t02.n01.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitService {

    @Autowired
    private FruitRepository fruitRepository;

    public Fruit createFruit(Fruit fruit){
        return fruitRepository.save(fruit);
    }

    public Fruit updateFruit(Fruit fruit){
        return fruitRepository.save(fruit);
    }

    public void deleteFruit(Long id) {
        fruitRepository.deleteById(id);
    }

    public Fruit getOneFruit(Long id) {
        return fruitRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Fruit with ID " + id + " doesn't exist"));
    }

    public List<Fruit> getAllFruits(){
        return fruitRepository.findAll();
    }

}
