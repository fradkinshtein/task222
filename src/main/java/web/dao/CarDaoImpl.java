package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> carList = new ArrayList<>();

    @Override
    public List<Car> getCars(String count, List<Car> list) {
        carList.clear();
        if (count == null || Integer.parseInt(count) >= 5) {
            return list;
        } else {
            for (int i = 0; i < Integer.parseInt(count); i++) {
                carList.add(list.get(i));
            }
            return carList;
        }
    }
}
