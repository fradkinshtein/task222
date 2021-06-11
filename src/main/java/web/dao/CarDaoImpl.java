package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> carList = new ArrayList() {{
        add(new Car("Lada", "Priora", "Black"));
        add(new Car("Chevrole", "Niva", "White"));
        add(new Car("Lambo", "Diablo", "Yellow"));
        add(new Car("Jeep", "Wrangler", "Green"));
        add(new Car("Volvo", "XC80", "White"));
        add(new Car("Mers", "SLK", "Blue"));
    }};

    @Override
    public List<Car> getAllCars() {
        return carList;
    }

}
