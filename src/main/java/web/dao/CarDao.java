package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Component
public class CarDao {
    private List<Car> carList;

    {
        carList = new ArrayList<>(List.of(
                new Car("Honda", "Civic", 2002),
                new Car("Mercedes", "GLA", 2010),
                new Car("Lada", "Granta", 2019),
                new Car("Toyota", "Corolla", 2003),
                new Car("Kia", "Rio", 2023)
        ));
    }

    public List<Car> showCar(int count) {
        if (count >= carList.size()) {
            return carList;
        } else if (count < 0) {
            return Collections.emptyList();
        } else {
            return carList.subList(0, count);
        }
    }
}