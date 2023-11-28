package java_09m.interfacetest.test4;

public enum Action {
    EAT(1, "밥을먹다."), SLEEP(2, "잠을자다"), MOVED(3, "걷다."), STOP(4, "멈추다.");
    private final int id;
    private final String action;

    Action(int id, String action) {
        this.id = id;
        this.action = action;
    }

    public String toValueString() {
        String type = this.toString();
        String value = "";
        switch (type){
            case "EAT" :
                value = "밥을먹다."; break;
            case "SLEEP" :
                value = "잠을자다."; break;
            case "MOVED" :
                value = "걷다."; break;
            case "STOP" :
                value = "멈추다."; break;
        }
        return value;
    }
}
