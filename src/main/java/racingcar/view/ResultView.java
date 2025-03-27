package racingcar.view;

import java.util.List;
import java.util.Map;

public class ResultView {
    public void printResult(List<Map<String, String>> carPos) {
        for (Map<String, String> carMap : carPos) {
            String key = carMap.keySet().iterator().next();  // keySet()에서 첫 번째 키 가져오기
            String value = carMap.values().iterator().next();  // values()에서 첫 번째 값 가져오기
            System.out.println(key + " : " + value);
        }
        System.out.println();
    }

    public void printWinner(List<String> carNames) {
        System.out.println("최종 우승자 : " + String.join(", ", carNames));
    }

    public void printGameStart(){
        System.out.println("실행 결과");
    }
}
