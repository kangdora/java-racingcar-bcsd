package racingcar.model;

import java.util.Random;

public class Car{
    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
        position = 0;
    }

    public void moveCar(){
        if (rollDice() >= 4) {
            position += 1;
        }
    }

    private int rollDice() {
        Random rd = new Random();
        return rd.nextInt(10);
    }

    public String getName(){
        return name;
    }

    public int getPosition(){
        return position;
    }
}
