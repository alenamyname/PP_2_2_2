package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.dao.CarDao;

import java.util.List;

@Service
public class CarService {
    private final CarDao carDao;

    public CarService(CarDao carDAO) {
        this.carDao = carDAO;
    }

    public List<Car> showCar(int count) {
        return carDao.showCar(count);
    }
}
