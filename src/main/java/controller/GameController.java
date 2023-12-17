package controller;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class GameController {
    String CarName = null; // 자동차 이름
    String Count = null; // 횟수
    List<Car> list = new ArrayList<>(); // split한 자동차들을 담아놓을 변수

    public GameController(){
        inputCar();
        inputCount();
        race();
        winner();
    }

    void inputCar(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        CarName = Console.readLine();
        String[] CarArray = CarName.split(","); // 자동차 구분하기
        for(int i=0;i<CarArray.length;i++){
            if(CarArray[i].length()>=5){
                throw new IllegalArgumentException("사용자 이름은 5자 이하로 입력해주세요");
            }
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
        System.out.println("\n실행결과");
        for (Car cars: list) {
            System.out.println(cars.getName()+" : "+"-".repeat(cars.getDistance()));
        }
    }

    int findTop(){ //Distance가 높은 사람찾기
        int top = list.get(0).getDistance();

        for(int i=1;i<list.size();i++) {
            if(list.get(i).getDistance() >= top){
                top = list.get(i).getDistance();
            }
        }
    return  top;
    }

    void winner(){
        int top = findTop();
        String winners = "";

        StringJoiner sj = new StringJoiner(", "); // 문자열을 구분자로 이어 붙이는 Class

        for (int i=0;i<list.size();i++){
            if(list.get(i).getDistance()==top){
                sj.add(list.get(i).getName());
            }
        }
        winners = sj.toString();

        System.out.println("최종 우승자 : "+winners);
    }
}
