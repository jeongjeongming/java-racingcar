package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private final List<Car> cars;
    private final int tryCount;

    public Race(List<Car> cars, int tryCount) {
        this.cars = cars;
        this.tryCount = tryCount;
    }

    public void start() {
        for (int i = 0; i < tryCount; i++) {
            moveCars();
            ResultView.printRaceResult(cars);
        }
    }

    private void moveCars() {
        for (Car car : cars) {
            int number = Randoms.pickNumberInRange(0, 9);
            car.move(number);
        }
    }

    public List<String> getWinners() {
        int maxPosition = cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);

        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                winners.add(car.getName());
            }
        }
        return winners;
    }
}
