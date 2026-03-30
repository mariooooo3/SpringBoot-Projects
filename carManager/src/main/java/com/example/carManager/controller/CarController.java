package com.example.carManager.controller;

import com.example.carManager.model.Car;
import com.example.carManager.repository.CarRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    private CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable Long id) {
        return carRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Car addCar(@RequestBody Car car) {
        return carRepository.save(car);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id) {
        carRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Car updateCar(@PathVariable Long id, @RequestBody Car updatedCar) {
        Car car = carRepository.findById(id).orElse(null);

        if (car != null) {
            car.setPrice(updatedCar.getPrice());
            car.setColor(updatedCar.getColor());
            car.setBrand(updatedCar.getBrand());
            car.setModel(updatedCar.getModel());

            return carRepository.save(car);
        }

        return null;
    }
}


