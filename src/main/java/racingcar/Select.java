package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Select {
    Input input;
    Move move;
    void randomPick(){
        for(int i =0;i<Integer.parseInt(input.Count);i++){
            for(int j=0;j<input.CarMaps.size();j++) {
                int num = Randoms.pickNumberInRange(0, 9);
                if(num >= 4){
                    move.forward();
                }
            }
        }

    }
    void winner(){

    }
}
