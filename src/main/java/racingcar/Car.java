package racingcar;

public class Car {
    private static final int MOVE_THRESHOLD = 4;
    private static final String POSITION_MARK = "-";

    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move(int randomNumber) {
        if (randomNumber >= MOVE_THRESHOLD) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " : " + POSITION_MARK.repeat(position);
    }
}
