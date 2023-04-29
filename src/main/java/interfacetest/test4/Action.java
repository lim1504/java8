package interfacetest.test4;

public enum Action {
    EAT("밥을먹다."), SLEEP("잠을자다"), MOVED("걷다."), STOP("멈추다.");

    private final String action;

    Action(String action) {
        this.action = action;
    }
}
