package racingcar;

import racingcar.controller.CarRaceController;

public class Application {
    public static void main(String[] args) {
        CarRaceController carRace = new CarRaceController();
        carRace.run();
    }
}
