package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        int[] moneyUnit = {50000,10000,5000,1000,500,100,50,10,1};
        List<Integer> answer = new ArrayList<>();
        int index = 0;
        while (money!=0){
            answer.add(money/moneyUnit[index]);
            money-=moneyUnit[index]* answer.get(index);
            index++;
        }
        while (index<moneyUnit.length){
            answer.add(0);
            index++;
        }
        return answer;
    }
}
