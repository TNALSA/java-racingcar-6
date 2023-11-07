package controller;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import domain.Car;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    String CarName = null;
    String Count = null;
    List<Car> list = new ArrayList<>();

    public GameController(){
        inputCar();
        inputCount();
        race();
    }

    void inputCar(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        CarName = Console.readLine();
        String[] CarArray = CarName.split(","); // 자동차 구분하기
        for(int i=0;i<CarArray.length;i++){
            list.add(new Car(CarArray[i],0));
        }
    }
    void inputCount(){
        System.out.println("시도할 회수는 몇회인가요?");
        Count = Console.readLine();
    }

    int pickNumber(){
        int num = Randoms.pickNumberInRange(0,9);
        return num;
    }

    void race(){
        for(int i=0;i<Integer.parseInt(Count);i++){
            for(int j=0;j<list.size();j++){
                int num = pickNumber();
                if(num >= 4){
                    list.get(j).forward();
                }
            }
            output();
            System.out.println();
        }
    }

    void output(){
        for (Car cars: list) {
            System.out.println(cars.getName()+":"+"-".repeat(cars.getDistance()));
        }
    }

    void winner(){
        for(int i=0;i<list.size();i++) {
            list.get(i).getDistance();

        }
    }

}
