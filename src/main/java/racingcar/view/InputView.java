package racingcar.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private final Scanner sc = new Scanner(System.in);

    public List<String> inputCarName() {
        System.out.println("차의 이름을 입력해주세요(구분은 ,로)");
        return Arrays.stream(sc.nextLine().split(",")).toList();
    }

    public int inputRaceCount() {
        System.out.println("경주 횟수를 입력해주세요.");
        return sc.nextInt();
    }
}
