package racingcar;
import camp.nextstep.edu.missionutils.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Input {
    String CarName;
    String Count;
    List<String> CarList = new ArrayList<String>();
    HashMap<String,Integer> CarMaps;

    Input(){
        CarInput();
        CountInput();
    }

    void CarInput(){ //자동차 이름 입력 받기
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
        CarName = Console.readLine();
        Division(CarName);
    }

    void Division(String CarName){ // 자동차 이름 분리하기
        CarList = Arrays.asList(CarName.split(","));
        System.out.println("Car Size: "+CarList.size());
        makeMap();
    }

    void makeMap(){ // HashMap에 자동차 이름과 전진 수를 넣기 위한 메소드
        for(int i=0;i<CarList.size();i++){
            CarMaps.put(CarList.get(i),0);
        }
    }
    void CountInput(){ // 횟수 입력하기
        System.out.println("시도할 회수는 몇회인가요?"); 
        Count = Console.readLine();
    }
}
