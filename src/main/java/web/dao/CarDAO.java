package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("BMW", 3, "diesel"));
        cars.add(new Car("TOYOTA", 200, "diesel"));
        cars.add(new Car("Opel", 7, "petrol"));
        cars.add(new Car("Pego", 308, "petrol"));
        cars.add(new Car("BMW", 7, "diesel"));
    }


    public List<Car> show(Long count) {
        if (count == null) {
            return cars;
        } else if (count < 5) {
            return cars.stream().limit(count).collect(Collectors.toList());}
        else
            return cars;
    }
}
