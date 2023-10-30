package racingcar;
import camp.nextstep.edu.missionutils.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Input {
    String CarName;
    String Count;
    String[] CarArrays;

    void CarInput(){
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
        CarName = Console.readLine();
        Division(CarName);
    }

    void Division(String CarName){
        CarArrays = CarName.split(",");
    }

    void CountInput(){
        System.out.println("시도할 회수는 몇회인가요?");
        Count = Console.readLine();
    }
}
