package controller;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import static messages.errorMessage.NAME_LENGTH_MESSAGE;

import static messages.inputMessage.INPUT_COUNT_MESSAGE;
import static messages.inputMessage.INPUT_CAR_MESSAGE;

import static messages.outputMessage.*;
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
        System.out.println(INPUT_CAR_MESSAGE.getMessage());
        CarName = Console.readLine();
        String[] CarArray = CarName.split(","); // 자동차 구분하기
        for(int i=0;i<CarArray.length;i++){
            if(CarArray[i].length()>=5){
                throw new IllegalArgumentException(NAME_LENGTH_MESSAGE.getMessage());
            }
            list.add(new Car(CarArray[i],0));
        }
    }
    void inputCount(){
        System.out.println(INPUT_COUNT_MESSAGE.getMessage());
        Count = Console.readLine();
    }

    int pickNumber(){
        int num = Randoms.pickNumberInRange(0,9);
        return num;
    }

    void race(){
        System.out.println(OUTPUT_RESULT_MESSAGE.getMessage());
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
            System.out.println(cars.getName()+OUTPUT_SEPARATOR_MESSAGE.getMessage()+OUTPUT_PROGRESS_MESSAGE.getMessage().repeat(cars.getDistance()));
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

        StringJoiner sj = new StringJoiner(OUTPUT_WINNER_SEPARATOR_MESSAGE.getMessage()); // 문자열을 구분자로 이어 붙이는 Class

        for (int i=0;i<list.size();i++){
            if(list.get(i).getDistance()==top){
                sj.add(list.get(i).getName());
            }
        }
        winners = sj.toString();

        System.out.println(OUTPUT_WINNER_MESSAGE.getMessage()+winners);
    }
}
