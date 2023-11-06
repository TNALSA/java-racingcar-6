package racingcar;
import camp.nextstep.edu.missionutils.*;

public class Move {
    int num = Randoms.pickNumberInRange(0,9);
    String status = "";
    String forward(){ // 전진
        status.concat("-");
        return status;
    }

    String stop(){ // 정지
        return status;
    }

}
