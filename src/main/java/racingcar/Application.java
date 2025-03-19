package racingcar;

import racingcar.controller.CarRaceController;
import racingcar.view.InputView;
import racingcar.view.ResultView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();

        CarRaceController carRace = new CarRaceController(inputView, resultView);
        carRace.run();
    }
}
