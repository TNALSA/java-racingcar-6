package racingcar;
import camp.nextstep.edu.missionutils.*;

import java.util.HashMap;
import java.util.Map;

public class Move {
    Input input;
    String status = "";

    String forward(){ // 전진
        status.concat("-");
        return status;
    }

    String stop(){ // 정지
        return status;
    }

}
