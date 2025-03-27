package racingcar;

public enum ErrorMessage {
    INVAILD_CARNAME("이름이 조건과 맞지 않습니다."),
    INVAILD_RACECOUNT("경주는 최소 1회 이상 진행되어야 합니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
