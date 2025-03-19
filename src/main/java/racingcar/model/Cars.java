package racingcar.model;

import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<String> getWinningCarNames() {
        int maxPosition = getMaxPosition();

        List<Car> winningCars = getWinningCars(maxPosition);

        return winningCars.stream()
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    private int getMaxPosition() {
        int maxPosition = 0;
        for (Car car : cars) {
            maxPosition = Math.max(maxPosition, car.getPosition());
        }
        return maxPosition;
    }

    private List<Car> getWinningCars(int maxPosition) {
        return cars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .collect(Collectors.toList());
    }

    public List<Car> getCars(){
        return cars;
    }

    public void moveCars(){
        for (Car car : cars) {
            car.moveCar();
        }
    }
}
