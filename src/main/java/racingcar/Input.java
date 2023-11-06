package racingcar;
import camp.nextstep.edu.missionutils.*;

import java.util.*;

public class Input {
    String CarName;
    String Count;
    int ranNumber = 0;
    List<String> CarList = new ArrayList<String>();
    Map<String,String> CarMaps = new HashMap<String, String>();

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
            CarMaps.put(CarList.get(i),"");
        }
    }

    void CountInput(){ // 횟수 입력하기
        System.out.println("시도할 회수는 몇회인가요?"); 
        Count = Console.readLine();
    }
}
