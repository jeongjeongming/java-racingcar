package racingcar;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.Car;

public class CarFactory {
    public static List<Car> createCars(List<String> names) {
        return names.stream()
                .map(String::trim)
                .map(Car::new)
                .collect(Collectors.toList());
    }
}
