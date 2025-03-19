package racingcar.controller;

import racingcar.model.Car;
import racingcar.view.InputView;
import racingcar.view.ResultView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CarRaceController {
    InputView inputView;
    ResultView resultView;

    public void run() {
        List<Car> cars = new ArrayList<>();

        List<String> carNames = inputView.inputCarName();
        int raceCount = inputView.inputRaceCount();

        carNames.stream().map(Car::new).forEach(cars::add);

        runGames(cars, raceCount);

        endGame(getWinningCarNames(getWinningCars(cars, getMaxPosition(cars))));
    }

    private void runGames(List<Car> cars, int raceCount) {
        for (int i = 0; i < raceCount; i++) {
            runGame(cars);
        }
    }

    private void runGame(List<Car> cars) {
        List<Map<String, String>> carPos = new ArrayList<>();
        for (Car car : cars) {
            Map<String, String> carData = new HashMap<>();
            carData.put(car.getName(), "-".repeat(car.getPosition()));
            carPos.add(carData);
        }
        resultView.printResult(carPos);
    }

    private void endGame(List<String> carNames) {
        resultView.printWinner(carNames);
    }

    private List<String> getWinningCarNames(List<Car> cars) {
        List<String> carNames = new ArrayList<>();
        for (Car car: cars){
            carNames.add(car.getName());
        }
        return carNames;
    }

    private int getMaxPosition(List<Car> cars) {
        int maxPosition = 0;
        for (Car car : cars) {
            maxPosition = Math.max(maxPosition, car.getPosition());
        }
        return maxPosition;
    }

    private List<Car> getWinningCars(List<Car> cars, int maxPosition) {
        return cars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .collect(Collectors.toList());
    }
}
