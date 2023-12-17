package messages;

public enum outputMessage {

    OUTPUT_PROGRESS_MESSAGE("-"),
    OUTPUT_RESULT_MESSAGE("\n실행결과"),
    OUTPUT_SEPARATOR_MESSAGE(" : "),
    OUTPUT_WINNER_MESSAGE("최종 우승자 : "),
    OUTPUT_WINNER_SEPARATOR_MESSAGE(", ");

    private final String message;
    outputMessage(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }

}
