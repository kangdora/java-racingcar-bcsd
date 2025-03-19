package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class Car{
    private final String name;
    private int position;

    public Car(String name) {
        if (name == null || name.isEmpty() || name.length() > 5) {
            throw new IllegalArgumentException("이름이 조건과 맞지 않습니다.");
        }

        this.name = name;
        position = 0;
    }

    public void moveCar(){
        if (rollDice() >= 4) {
            position += 1;
        }
    }

    private int rollDice() {
        return Randoms.pickNumberInRange(0,9);
    }

    public String getName(){
        return name;
    }

    public int getPosition(){
        return position;
    }
}
