package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.ErrorMessage;

public class Car{
    private final String name;
    private int position;

    private Car(String name) {
        if (name == null || name.isEmpty() || name.length() > 5) {
            throw new IllegalArgumentException(ErrorMessage.INVAILD_CARNAME.getMessage());
        }
        this.name = name;
        position = 0;
    }

    public static Car nameOf(String name) {
        return new Car(name);
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
