package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.view.InputView;
import racingcar.view.ResultView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarRaceController {
    private final InputView inputView;
    private final ResultView resultView;

    public CarRaceController(InputView inputView, ResultView resultView) {
        this.inputView = inputView;
        this.resultView = resultView;
    }

    public void run() {
        Cars cars = new Cars(participateCars());
        int raceCount = getRaceCount();

        runGames(cars, raceCount);

        endGame(cars.getWinningCarNames());
    }

    private List<Car> participateCars() {
        List<Car> carList = new ArrayList<>();

        List<String> carNames = inputView.inputCarName();

        carNames.stream().map(Car::nameOf).forEach(carList::add);

        return carList;
    }

    private int getRaceCount() {
        int raceCount = inputView.inputRaceCount();
        if (raceCount <= 0) {
            throw new IllegalArgumentException("경주는 최소 1회 이상이 진행되어야 합니다.");
        }
        return raceCount;
    }

    private void runGames(Cars cars, int raceCount) {
        resultView.printGameStart();
        for (int i = 0; i < raceCount; i++) {
            cars.moveCars();
            displayData(cars.getCars());
        }
    }

    private void displayData(List<Car> cars) {
        List<Map<String, String>> carData = new ArrayList<>();
        for (Car car : cars) {
            Map<String, String> carPositions = new HashMap<>();
            carPositions.put(car.getName(), "-".repeat(car.getPosition()));
            carData.add(carPositions);
        }
        resultView.printResult(carData);
    }

    private void endGame(List<String> carNames) {
        resultView.printWinner(carNames);
    }
}
