package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.models.Car;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl implements CarService {
    private CarDao carDao;

    private CarService carService;

    @Autowired
    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }

    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    @Override
    @Transactional
    public List<Car> getNumberOfCars(String count) {
        List<Car> l = new ArrayList<>();

        if (count == null || Integer.parseInt(count) >= 5) {
            return carDao.getAllCars();
        } else {

            for (int i = 0; i < Integer.parseInt(count); i++) {
                l.add(carDao.getAllCars().get(i));
            }
            return l;
        }
    }
}
