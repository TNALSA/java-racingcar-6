package racingcar;

public class Move {
    String status = "";
    String forward(){
        status.concat("-");
        return status;
    }

    String stop(){
        return status;
    }

}
