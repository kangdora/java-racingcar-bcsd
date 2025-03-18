package racingcar.view;

import java.util.List;
import java.util.Map;

public class ResultView {
    public void printWinner(List<String> carNames) {
        System.out.print("우승자는 ");

        for (String car : carNames) {
            System.out.print(car);
        }

        System.out.print("입니다.");
    }

    public void printResult(List<Map<String, String>> carPos) {
        for (Map<String, String> carMap : carPos) {
            System.out.println(carMap.keySet() + " : " + carMap.values());
        }
    }

}
