package com.company;

import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class CarRepository {
    private CarDao carsDao = new CarDao();

    public Car findCar(int id) {
        return carsDao.findById(id);
    }

    public void saveCar(Car car) {
        carsDao.save(car);
    }

    public void deleteCar(Car car) {
        carsDao.delete(car);
    }

    public void updateCar(Car car) {
        carsDao.update(car);
    }

    public List<Car> findAllCars() {
        return carsDao.findAll();
    }
}
