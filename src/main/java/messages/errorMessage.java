package messages;

public enum errorMessage {
    NAME_LENGTH_MESSAGE("이름을 5자 이하로 입력하세요.");

    private final String message;

    errorMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
