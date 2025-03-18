package racingcar.view;

import java.util.Scanner;

public class InputView {
    Scanner sc = new Scanner(System.in);

    public String[] inputCarName() {
        System.out.println("차의 이름을 입력해주세요(구분은 ,로)");
        return sc.nextLine().split(",");
    }

    public int inputRaceCount() {
        System.out.println("경주 횟수를 입력해주세요.");
        return sc.nextInt();
    }
}
