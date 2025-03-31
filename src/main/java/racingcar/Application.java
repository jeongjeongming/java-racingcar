package racingcar;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> carNames = InputView.getCarNames();
        int tryCount = InputView.getTryCount();

        List<Car> cars = CarFactory.createCars(carNames);

        System.out.println();
        Race race = new Race(cars, tryCount);
        race.start();

        ResultView.printWinners(race.getWinners());
    }
}
