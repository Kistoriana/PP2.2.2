package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    private static int carCount;
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++carCount, "KIA", 5));
        cars.add(new Car(++carCount, "BMW", 5));
        cars.add(new Car(++carCount, "Mercedes", 900));
        cars.add(new Car(++carCount, "Volvo", 460));
        cars.add(new Car(++carCount, "Mazda", 6));
    }

    public List<Car> getCars(int id) {
        if (id >= 5) {
            return cars.subList(0, 5);
        }
        return cars.subList(0, id);
    }
}
