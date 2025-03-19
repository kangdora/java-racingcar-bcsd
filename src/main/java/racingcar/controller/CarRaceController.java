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
    InputView inputView = new InputView();
    ResultView resultView = new ResultView();

    public void run() {
        Cars cars = new Cars(participateCars());
        int raceCount = inputView.inputRaceCount();

        runGames(cars, raceCount);

        endGame(cars.getWinningCarNames());
    }

    private List<Car> participateCars(){
        List<Car> carList = new ArrayList<>();

        List<String> carNames = inputView.inputCarName();

        carNames.stream().map(Car::new).forEach(carList::add);

        return carList;
    }

    private void runGames(Cars cars, int raceCount) {
        System.out.println("실행 결과");
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
