package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList; {
            carList = new ArrayList<>();
            carList.add(new Car("Honda", "Civic", 2002));
            carList.add(new Car("Mercedes", "GLA", 2010));
            carList.add(new Car("Lada", "Granta", 2019));
            carList.add(new Car("Toyota", "Corolla", 2003));
            carList.add(new Car("Kia", "Rio", 2023));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}