package racingcar.view;

import java.util.List;
import java.util.Map;

public class ResultView {
    public void printWinner(List<String> carNames) {
        System.out.print("최종 우승자 : ");

        for (String car : carNames) {
            System.out.print(car);
        }
        // TODO: 최종 우승자 Stream API로 구분자 추가해서 로직만들기
    }

    public void printResult(List<Map<String, String>> carPos) {
        for (Map<String, String> carMap : carPos) {
            System.out.println(carMap.keySet() + " : " + carMap.values());
        }
    }

}
