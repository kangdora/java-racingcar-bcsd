package racingcar.view;

import java.util.List;

public class ResultView {
    public void printResult(List<String> carNames) {
        System.out.print("우승자는 ");

        for (String car : carNames) {
            System.out.print(car);
        }

        System.out.print("입니다.");
    }
}
